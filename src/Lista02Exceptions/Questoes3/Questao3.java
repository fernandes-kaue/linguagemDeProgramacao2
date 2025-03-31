package Lista02Exceptions.Questoes3;

public class Questao3 {
    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 6, 8, 10, 12};

        try {
            for (int i = 0; i <= 12; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Tentativa de acesso à indice inválido. Programa será encerrado.");
            System.exit(1);
        }


    }
}
