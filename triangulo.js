import java.util.Scanner;

public class TipoTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos três lados do triângulo
        System.out.println("Digite o valor do primeiro lado: ");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o valor do segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o valor do terceiro lado: ");
        int lado3 = scanner.nextInt();

        // Verificação do tipo de triângulo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }

        scanner.close();
    }
}
