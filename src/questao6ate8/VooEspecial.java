package questao6ate8;

import java.util.Date;

public class VooEspecial extends Voo {
    public VooEspecial(int numero, Date dataHorario) {
        super(numero, dataHorario);
    }

    public VooEspecial(int numero, Date dataHorario, int numeroPassageiros) {
        super(numero, dataHorario);
        this.assentosTotal = new int[numeroPassageiros];
    }

}
