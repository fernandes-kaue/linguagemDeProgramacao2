package questao6ate8;

import java.util.Date;

public class Voo {
    private int numero;
    private int[] assentosTotal;
    private int assentosOcupados;
    private int assentosLivres;
    private Date dataHorario;

    // metodos
    public int getProximoAssentoLivre() {
        for (int i : assentosTotal) {
            if (i != 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean isAssentoLivre(int n){
        return assentosTotal[n] == 0;
    }

    public int getTotalAssentosLivres(){
        int totalLivres = 0;
        for (int i : assentosTotal) {
            if (i == 1) {
                totalLivres++;
            }
        }
        return totalLivres;
    }

    private int getTotalAssentosOcupados() {
        int totalOcupados = 0;
        for (int i : assentosTotal) {
            if (i == 0) {
                totalOcupados++;
            }
        }
        return totalOcupados;
    }

    public int getTaxaOcupacao() {
        return this.getTotalAssentosOcupados()/assentosTotal.length;
    }

    @Override
    public Object clone(){
        Voo voo = this;
        return voo;
    }

    // metodo auxiliar de data??


    // constructor
    public Voo(int numero, Date dataHorario) {
        this.numero = numero;
        this.dataHorario = dataHorario;
        this.assentosTotal = new int[70];
    }

    // getters

    public int getNumero() {
        return numero;
    }

    public int[] getAssentosTotal() {
        return assentosTotal;
    }

    public int getAssentosOcupados() {
        return assentosOcupados;
    }

    public int getAssentosLivres() {
        return assentosLivres;
    }

    public Date getDataHorario() {
        return dataHorario;
    }
}
