package questao11ate;

class ExemplarUtil {
    public static void main(String[] args) {
        Exemplar ex1 = new Exemplar(101, "Casa de Folhas", "Mark Z. Danielewski", true);
        Exemplar ex2 = new Exemplar(102, "Meridiano Sangrento", "Gabriela Garcia", true);
        Exemplar ex3 = new Exemplar(103, "O Nome da Rosa", "Umberto Eco", true);
        Exemplar ex4 = new Exemplar(104, "1984", "George Orwell", false);
        Exemplar ex5 = new Exemplar(105, "Cem Anos de Solidão", "Gabriel García Márquez", true);
        Exemplar ex6 = new Exemplar(106, "O Grande Gatsby", "F. Scott Fitzgerald", false);

        ex1.adicionarEmprestimo();
        ex2.adicionarEmprestimo();
        ex3.adicionarEmprestimo();
        ex4.adicionarEmprestimo();
        ex5.adicionarEmprestimo();
        ex6.adicionarEmprestimo();

        System.out.println(ex1.getNumEmprestimos());
        System.out.println(ex2.getNumEmprestimos());
        System.out.println(ex3.getNumEmprestimos());
        System.out.println(ex4.getNumEmprestimos());
        System.out.println(ex5.getNumEmprestimos());
        System.out.println(ex6.getNumEmprestimos());

    }
}
