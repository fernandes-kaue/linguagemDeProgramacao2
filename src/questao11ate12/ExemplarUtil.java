package questao11ate12;

import java.util.Scanner;

class ExemplarUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exemplar[] livros = new Exemplar[6];

        livros[0] = new Exemplar(1, "Assim Falou Zaratustra", "Friedrich Nietzsche", true);
        livros[1] = new Exemplar(2, "Além do Bem e do Mal", "Friedrich Nietzsche", true);
        livros[2] = new Exemplar(3, "O Crepúsculo dos Ídolos", "Friedrich Nietzsche", false);
        livros[3] = new Exemplar(4, "A República", "Platão", true);
        livros[4] = new Exemplar(5, "O Banquete", "Platão", true);
        livros[5] = new Exemplar(6, "Fédon", "Platão", false);

        int opcao;

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Habilitação de exemplar para empréstimo.");
            System.out.println("2. Desabilitação de exemplar para empréstimo. ");
            System.out.println("3. Registro de novo empréstimo. ");
            System.out.println("4. Exibição de total de empréstimos da biblioteca. ");
            System.out.println("5. Exibir informações de título com maior quantidade de empréstimos. ");
            System.out.println("6. Sair do sistema.");

            opcao = sc.nextInt();
            sc.nextLine();

            String titulo;
            boolean encontrado;

            switch (opcao) {
                case 1:
                    System.out.println("Informe título que será apto para empréstimo: ");
                     titulo = sc.nextLine();
                     encontrado = false;

                    for (Exemplar livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                            livro.habilitarEmprestimo();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Livro não encontrado!");
                    break;

                case 2:
                    System.out.println("Informe título que será inapto para empréstimo: ");
                    titulo = sc.nextLine();
                    encontrado = false;

                    for (Exemplar livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                            livro.desabilitarEmprestimo();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Livro não encontrado!");
                    break;

                case 3:
                    System.out.println("Informe título de exemplar que sofreu um novo empréstimo:");
                    titulo = sc.nextLine();
                    encontrado = false;

                    for (Exemplar livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                            livro.adicionarEmprestimo();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Livro não encontrado!");
                    break;

                case 4:
                    int totalEmprestimos = 0;

                    for (Exemplar livro : livros) {
                        totalEmprestimos += livro.getNumEmprestimos();
                    }

                    System.out.println("O total de empréstimos da livraria é de " + totalEmprestimos + " empréstimos.");
                    break;

                case 5:
                    int maiorQtdEmp = 0;
                    for (Exemplar livro : livros) {
                        if (livro.getNumEmprestimos() > maiorQtdEmp) {
                            maiorQtdEmp = livro.getNumEmprestimos();
                        }
                    }

                    System.out.println("O(s) livro(s) com a maior quantidade de empréstimo é: ");
                    for (Exemplar livro : livros) {
                        if (livro.getNumEmprestimos() == maiorQtdEmp) {
                            System.out.println(livro);
                        }
                    }


                    break;

                case 6:
                    System.out.println("Encerrando sistema...");
                    sc.close();
                    System.exit(0);

                default:
                    System.err.println("Opção inválida. Tente novamente.");
            }

        }
    }
}
