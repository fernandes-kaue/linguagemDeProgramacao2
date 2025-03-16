package questao11ate;

class Exemplar {
    private int numTombo;
    private String titulo;
    private String autoria;
    protected boolean aptoEmprestimo;
    protected int numEmprestimos;

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
            this.aptoEmprestimo = true;
        }
    }
    void desabilitarEmprestimo(){
        if (!aptoEmprestimo){
            System.out.println("Esse livro já é inapto para empréstimos!");
        } else {
            this.aptoEmprestimo = false;
        }
    }

    void adicionarEmprestimo(){
        if (aptoEmprestimo){
            this.numEmprestimos++;
        } else {
            System.out.println("Esse livro é inapto para empréstimos, portanto, não se pode adicionar empréstimos à ele.");
        }
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
