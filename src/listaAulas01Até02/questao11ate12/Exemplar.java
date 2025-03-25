package listaDeAquecimento.questao11ate12;

class Exemplar {
    private int numTombo;
    private String titulo;
    private String autoria;
    private boolean aptoEmprestimo;
    private int numEmprestimos;

    // construtor
    Exemplar(int numTombo, String titulo, String autoria, boolean aptoEmprestimo) {
        this.numTombo = numTombo;
        this.titulo = titulo;
        this.autoria = autoria;
        this.aptoEmprestimo = aptoEmprestimo;
        this.numEmprestimos = 0;
    }

    // metodos especificos
    void habilitarEmprestimo(){
        if (aptoEmprestimo){
            System.out.println("Esse livro já está apto para empréstimos!");
        } else {
            System.out.println("Livro habilitado com sucesso!");
            this.aptoEmprestimo = true;
        }
    }
    void desabilitarEmprestimo(){
        if (!aptoEmprestimo){
            System.out.println("Esse livro já é inapto para empréstimos!");
        } else {
            System.out.println("Livro desabilitado com sucesso!");
            this.aptoEmprestimo = false;
        }
    }

    void adicionarEmprestimo(){
        if (aptoEmprestimo){
            System.out.println("Empréstimo adicionado.");
            this.numEmprestimos++;
        } else {
            System.out.println("Esse livro é inapto para empréstimos, portanto, não se pode adicionar empréstimos à ele.");
        }
    }

    @Override
    public String toString() {
        return "Exemplar{" +
                "numTombo=" + numTombo +
                ", titulo='" + titulo + '\'' +
                ", autoria='" + autoria + '\'' +
                ", aptoEmprestimo=" + (aptoEmprestimo ? "Sim" : "Não") +
                ", numEmprestimos=" + numEmprestimos +
                '}';
    }


    // getters
    public int getNumTombo() {
        return numTombo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutoria() {
        return autoria;
    }

    public boolean isAptoEmprestimo() {
        return aptoEmprestimo;
    }

    public int getNumEmprestimos() {
        return numEmprestimos;
    }

}
