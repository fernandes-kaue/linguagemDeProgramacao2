package questao4;

public class Main {
    public static void main(String[] args) {
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
        


    }
}
