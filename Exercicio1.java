import java.util.Scanner;

public class Exercicio1 {

    // metodo para inverter o vetor
    public static void inverterVetor(int[] vetor, int N) {
        int inicio = 0;
        int fim = N - 1;

        while (inicio < fim) {
            // troca os elementos
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            // move os índices
            inicio++;
            fim--;
        }
    }

    // metodo para exibir o vetor
    public static void exibirVetor(int[] vetor, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // le a quantidade de elementos do vetor
        System.out.print("Digite o número de elementos do vetor: ");
        int N = scanner.nextInt();

        // cria o vetor com base no número de elementos
        int[] vetor = new int[N];

        // le os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < N; i++) {
            vetor[i] = scanner.nextInt();
        }

        // exibe o vetor original
        System.out.println("Vetor original:");
        exibirVetor(vetor, N);

        // inverte o vetor
        inverterVetor(vetor, N);

        // exibe o vetor invertido
        System.out.println("Vetor invertido:");
        exibirVetor(vetor, N);

    }
}
