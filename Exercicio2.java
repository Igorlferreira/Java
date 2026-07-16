import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    // metodo para inverter o ArrayList
    public void inverter(ArrayList<Integer> arr) {
        int inicio = 0;
        int fim = arr.size() - 1;

        while (inicio < fim) {
            // troca os elementos
            Integer temp = arr.get(inicio);
            arr.set(inicio, arr.get(fim));
            arr.set(fim, temp);

            // move os indices
            inicio++;
            fim--;
        }
    }

    // metodo para exibir o ArrayList
    public void exibir(ArrayList<Integer> arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Exercicio2 exercicio = new Exercicio2();

        // cria um arraylist para armazenar os elementos
        ArrayList<Integer> arr = new ArrayList<>();

        // le a quantidade de elementos do arraylist
        System.out.print("Digite o número de elementos do ArrayList: ");
        int N = scanner.nextInt();

        // le os elementos e adiciona ao arraylist
        System.out.println("Digite os elementos do ArrayList:");
        for (int i = 0; i < N; i++) {
            arr.add(scanner.nextInt());
        }

        // exibe o arraylist original
        System.out.println("ArrayList original:");
        exercicio.exibir(arr);

        // inverte o arraylist
        exercicio.inverter(arr);

        // exibe o arraylist invertido
        System.out.println("ArrayList invertido:");
        exercicio.exibir(arr);

    }
}
