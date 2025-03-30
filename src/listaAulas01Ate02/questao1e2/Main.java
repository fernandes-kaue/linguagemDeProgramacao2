<<<<<<<< HEAD:src/Lista01Recapitulacao/questao1e2/Main.java
package Lista01Recapitulacao.questao1e2;
========
package listaAulas01Ate02.questao1e2;
>>>>>>>> origin/main:src/listaAulas01Ate02/questao1e2/Main.java

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(17, 06, 1987);
        System.out.println(data1.mostrarData());
        Data data2 = new Data(17, 10, 1972);
        System.out.println(data2.mostrarData());
        Data data3 = new Data(01, 01, 1946);
        System.out.println(data3.mostrarData());

        System.out.println();

        System.out.println(data1.diasRestantes());
        System.out.println(data2.diasRestantes());
        System.out.println(data3.diasRestantes());

    }
}
