package listaAulas01Até02.questao4e5;

public class Main {
    public static void main(String[] args) {

        System.out.println("Contas normais: ");

        ContaCorrente conta1 = new ContaCorrente(1000);
        ContaCorrente conta2 = new ContaCorrente(2000);
        ContaCorrente conta3 = new ContaCorrente(3000);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());

        System.out.println();

        conta1.registrarDeposito(5);
        conta2.registrarDeposito(10);
        conta3.registrarDeposito(15);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());

        System.out.println();

        conta1.registrarSaque(15);
        conta2.registrarSaque(10);
        conta3.registrarSaque(15);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());

        System.out.println();

        // conta especial

        System.out.println("Contas especiais: ");

        ContaCorrenteEspecial conta4 = new ContaCorrenteEspecial(1000);
        ContaCorrenteEspecial conta5 = new ContaCorrenteEspecial(2000);
        ContaCorrenteEspecial conta6 = new ContaCorrenteEspecial(3000);

        System.out.println(conta4.getSaldo());
        System.out.println(conta5.getSaldo());
        System.out.println(conta6.getSaldo());

        System.out.println();

        conta4.registrarDeposito(5);
        conta5.registrarDeposito(10);
        conta6.registrarDeposito(15);

        System.out.println(conta4.getSaldo());
        System.out.println(conta5.getSaldo());
        System.out.println(conta6.getSaldo());

        System.out.println();

        conta4.registrarSaque(15);
        conta5.registrarSaque(10);
        conta6.registrarSaque(15);

        System.out.println(conta4.getSaldo());
        System.out.println(conta5.getSaldo());
        System.out.println(conta6.getSaldo());
        


    }
}
