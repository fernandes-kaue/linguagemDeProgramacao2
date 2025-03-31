package Lista02Exceptions.Questao4;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valorValido = false;


        do {
            try {
                System.out.println("Informe tamanho do array: ");
                int tamanho = sc.nextInt();
                if (tamanho < 0) {
                    throw new NegativeArraySizeException("");
                }
                int[] array = new int[tamanho];

                for (int i = 0; i < array.length; i++) {
                    System.out.println(String.format("Digite %dº número: ", i+1));
                    array[i] = sc.nextInt();
                }

                int soma = 0;
                for (int i = 0; i < array.length; i++) {
                    soma += array[i];
                }

                System.out.println("Soma = " + soma);
                valorValido = true;
            } catch (NegativeArraySizeException e) {
                System.err.println("Tamanho de array inválido. Digite novamente");
            }
        } while (!valorValido);




    }
}
