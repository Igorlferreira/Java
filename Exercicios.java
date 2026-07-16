public class Exercicios {
    public static void main(String args[]) {
        new Exercicios();
    }

    public Exercicios() {
        double a[] = {20, 10, -10, 30, 40, -20};
        visualizaVetor("Vetor de valores reais", a);

        // Chama e exibe a soma de todos os elementos
        double somaTotal = calcularSomaDosElementos(a);
        System.out.println("Soma de todos os elementos: " + somaTotal);

        // Chama e exibe a soma dos elementos positivos
        double somaPositivos = calcularSomaDosElementosPositivos(a);
        System.out.println("Soma dos elementos positivos: " + somaPositivos);
    }

    public void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " || ");
        }
        System.out.println();
    }

    // Método para calcular a soma de todos os elementos de um vetor
    public double calcularSomaDosElementos(double vet[]) {
        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        return soma;
    }

    // Método para calcular a soma dos elementos positivos de um vetor
    public double calcularSomaDosElementosPositivos(double vet[]) {
        double somaPositivos = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > 0) {
                somaPositivos += vet[i];
            }
        }
        return somaPositivos;
    }
}
