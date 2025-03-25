package questao11ate12.q13;

import questao11ate12.Exemplar;

import java.util.Date;

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
