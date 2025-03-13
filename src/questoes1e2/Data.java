package questoes1e2;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {

    private  int dia;
    private  int mes;
    private  int ano;



    // metodo para mostrar a data
    public String mostrarData() {
        String diaFormatado = String.format("%02d", dia);
        String mesFormatado = String.format("%02d", mes);
        return "A data armazenada é: " + diaFormatado + "/" + mesFormatado + "/" + ano;
    }

    //metodo para contar dias restantes do ano, feito com ajuda de chatgpt
    public long diasRestantes() {
        LocalDate dataAtual = LocalDate.of(ano, mes, dia);
        LocalDate ultimoDiaAno = LocalDate.of(ano, 12,  31);

        return ChronoUnit.DAYS.between(dataAtual, ultimoDiaAno);
    }


    // constructor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // getter and setter
    public  int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public  int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public  int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}