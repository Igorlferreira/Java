import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o total de gasolina que cabe no tanque (em litros): ");
        double litrosNoTanque = scanner.nextDouble();
        
        
        System.out.print("Digite o valor da gasolina por litro: ");
        double valorPorLitro = scanner.nextDouble();
        
        
        double valorTotalGasto = litrosNoTanque * valorPorLitro;
        
        
        System.out.printf("O valor total gasto para encher o tanque é: R$ %.2f%n", valorTotalGasto);
        
        scanner.close();
    }
}

