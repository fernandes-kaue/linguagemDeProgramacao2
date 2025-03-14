package questao9e10;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double horasTrabalhadasMes;
    private double valorHoraTrabalhada;

    // construtor
    Funcionario(String nome, String sobrenome, double valorHoraTrabalhada) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadasMes = 0;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    // metodos adicionais
    public void adicionarCargaHoraria(double h) {
        horasTrabalhadasMes += h;
    }

    double getSalarioLiquido() {
        double salBase = horasTrabalhadasMes * valorHoraTrabalhada;
        double descontos = 0;

        if (salBase > 7087.22) {
            descontos = salBase * 0.14;
        } else if (salBase > 3641.04) {
            descontos = salBase * 0.12;
        } else if (salBase > 2427.36) {
            descontos = salBase * 0.09;
        } else if (salBase >= 1212.01) {
            descontos = salBase * 0.075;
        }

        return (salBase - descontos);
    }





    // getters
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getHorasTrabalhadasMes() {
        return horasTrabalhadasMes;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }
}
