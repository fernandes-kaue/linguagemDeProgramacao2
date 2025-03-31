package Lista02Exceptions.Questoes1ate;

import java.util.InputMismatchException;

public class Conta {
    private double saldo; // saldo corrente
    private double saldoMinimo; // saldo mínimo (saldo atual não pode ser inferior a este saldo)

    // método construtor de inicialização de saldo mínimo
    public Conta(double saldoMinimo) {
        this.saldo = 0; // inicialização de saldo atual (corrente) com 0 (zero)
        this.saldoMinimo = saldoMinimo;
    }

    // retorno de valor atual do saldo mínimo
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    // atualização de valor atual do saldo mínimo
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    // retorno de valor atual do saldo corrente
    public double getSaldo() {
        return saldo;
    }

    // operação de registro de depósito em conta, com atualização de saldo corrente
    public void depositar(double deposito) {
        saldo += deposito;
    }

    // operação de registro de saque em conta, com atualização de saldo corrente
    public void sacar(double saque) {

        try {
            if (saldo - saque < saldoMinimo) {
                throw new ArithmeticException("");
            }

            saldo -= saque;
            System.out.println("Saque realizado com sucesso!");

        } catch (ArithmeticException e) {
            System.out.println("Erro ao sacar: saldo ficará abaixo de saldo mínimo!");
            throw e;
        }

    }
}
