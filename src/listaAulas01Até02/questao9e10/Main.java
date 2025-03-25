package listaDeAquecimento.questao9e10;

public class Main {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("kanye", "west", 100);
        Funcionario fun2 = new Funcionario("marshall", "mathers", 200);
        Funcionario fun3 = new Funcionario("mano", "brown", 300);
        Funcionario fun4 = new Funcionario("aubrey", "graham", 400);
        Funcionario fun5 = new Funcionario("kendrick", "lamar", 500);


        System.out.println("Salario liquido atual: ");
        System.out.println(fun1.getSalarioLiquido());
        System.out.println(fun2.getSalarioLiquido());
        System.out.println(fun3.getSalarioLiquido());
        System.out.println(fun4.getSalarioLiquido());
        System.out.println(fun5.getSalarioLiquido());

        System.out.println();

        fun1.adicionarCargaHoraria(10);
        fun2.adicionarCargaHoraria(10);
        fun3.adicionarCargaHoraria(10);
        fun4.adicionarCargaHoraria(10);
        fun5.adicionarCargaHoraria(10);

        System.out.println();

        System.out.println("Após adição de carga horária");
        System.out.println(fun1.getSalarioLiquido());
        System.out.println(fun2.getSalarioLiquido());
        System.out.println(fun3.getSalarioLiquido());
        System.out.println(fun4.getSalarioLiquido());
        System.out.println(fun5.getSalarioLiquido());

    }
}
