package questao4e5;

class ContaCorrenteEspecial extends ContaCorrente{
    public ContaCorrenteEspecial(double saldo) {
        super(saldo);
    }

    @Override
    public boolean registrarSaque(double valor) {
            if (valor > 0) {
                this.saldo = this.saldo - valor - (valor * 0.001);
                return true;
            } else {
                System.out.println("Valor inválido para depósito.");
                return false;
            }
        }
    }

