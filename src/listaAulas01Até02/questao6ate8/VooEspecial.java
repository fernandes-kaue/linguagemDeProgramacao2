package listaAulas01Até02.questao6ate8;

import java.util.Date;

class VooEspecial extends Voo {
    public VooEspecial(int numero, Date dataHorario) {
        super(numero, dataHorario);
    }

    public VooEspecial(int numero, Date dataHorario, int numeroPassageiros) {
        super(numero, dataHorario);
        this.assentosTotal = new int[numeroPassageiros];
    }

    public String getTotalAssentos() {
        int total = assentosTotal.length;
        return "O total de assentos do voo é de: " + Integer.toString(total);
    }

}
