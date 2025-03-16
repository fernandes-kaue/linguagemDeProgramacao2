package questao11ate;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class ExemplarDetalhado extends Exemplar {
    Date dataHora;

    public ExemplarDetalhado(int numTombo, String titulo, String autoria, boolean aptoEmprestimo) {
        super(numTombo, titulo, autoria, aptoEmprestimo);
    }

    public void adicionarEmprestimo() {
        if (aptoEmprestimo) {
            this.numEmprestimos++;
            this.dataHora = new Date();
        }
    }
}
