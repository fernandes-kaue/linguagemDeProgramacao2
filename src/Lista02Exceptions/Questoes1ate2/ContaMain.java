package Lista02Exceptions.Questoes1ate2;

import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) {
        double valor;
        Conta conta = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe Saldo Mínimo: ");
        valor = sc.nextDouble(); // entrada de saldo mínimo de conta
        conta = new Conta(valor); // inicialização de objeto da classe Conta

        System.out.print("\nInforme Depósito Inicial: ");
        valor = sc.nextDouble(); // entrada de valor de depósito inicial da conta
        conta.depositar(valor); // operação de depósito

        System.out.println("saldo atual " + conta.getSaldo());
        System.out.println("saldo minimo " + conta.getSaldoMinimo());

        System.out.print("\nInforme Saque após Depósito Inicial: ");
        valor = sc.nextDouble(); // entrada de valor de saque após depósito
        boolean entradaValida = false;

        do {
            try {
                conta.sacar(valor);
                entradaValida = true;

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.print("Informe um novo valor para saque: ");
                valor = sc.nextDouble();

            }

        } while (!entradaValida);

        System.out.println("\nSaldo Final: " + conta.getSaldo());
        sc.close();
    }
}