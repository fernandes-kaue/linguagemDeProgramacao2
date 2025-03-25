package listaDeAquecimento.questao4e5;

class ContaCorrente {
    protected double saldo;

    // metodos
    public boolean registrarDeposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            System.out.println("Valor inválido para depósito.");
            return false;
        }
    }

    public boolean registrarSaque(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo - valor - (valor * 0.005);
            return true;
        } else {
            System.out.println("Valor inválido para depósito.");
            return false;
        }
    }

    // getter
    public double getSaldo(){
        return saldo;
    }

    // constructor
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
}
