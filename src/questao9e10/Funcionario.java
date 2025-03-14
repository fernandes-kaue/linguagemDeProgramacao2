package questao9e10;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double horasTrabalhadasMes;
    private double valorHoraTrabalhada;
    private double salarioBase;

    // construtor
    Funcionario(String nome, String sobrenome, double salario, double valorHoraTrabalhada) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadasMes = 0;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    // metodos adicionais
    public void adicionarCargaHoraria(double h) {
        horasTrabalhadasMes += h;
    }

    double getSalarioLiquido() { // jeito dificil
        double salBase = horasTrabalhadasMes * valorHoraTrabalhada;
        double descontos = 0;
        if (salBase <= 7087.22 && salBase > 3641.04) {
            descontos = descontos + (salBase - (salBase * 0.14));
        }
        if (salBase <= 3641.03 && salBase >= 2427.36) {
            descontos = descontos + (salBase - (salBase * 0.12));
        }
        if (salBase <= 2427.35 && salBase >= 1212.01) {
            descontos = descontos + (salBase - (salBase * 0.09));
        }
        if (salBase <= 1212.00) {
            descontos = descontos + (salBase - (salBase * 0.075));
        }
        return salBase - descontos;
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
