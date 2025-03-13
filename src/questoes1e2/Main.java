package questoes1e2;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(17, 06, 1987);
        System.out.println(data1.mostrarData());
        Data data2 = new Data(17, 10, 1972);
        System.out.println(data2.mostrarData());
        Data data3 = new Data(01, 01, 1946);
        System.out.println(data3.mostrarData());

        System.out.println();

        System.out.println(data1.diasRestantes());
        System.out.println(data2.diasRestantes());
        System.out.println(data3.diasRestantes());

    }
}
