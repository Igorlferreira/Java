public class exercicio_1 {
    // Definindo a classe Veículo
    class Veiculo {
        private String placa;
        private String marca;
        private String modelo;
        private int anoFabricacao;

        public Veiculo(String placa, String marca, String modelo, int anoFabricacao) {
            this.placa = placa;
            this.marca = marca;
            this.modelo = modelo;
            this.anoFabricacao = anoFabricacao;
        }

        @Override
        public String toString() {
            return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + anoFabricacao;
        }
    }

// Implementando a pilha
import java.util.Stack;

    class Pilha {
        private Stack<Veiculo> pilha;

        public Pilha() {
            pilha = new Stack<>();
        }

        public void empilhar(Veiculo veiculo) {
            pilha.push(veiculo);
        }

        public Veiculo desempilhar() {
            if (!estaVazia()) {
                return pilha.pop();
            } else {
                System.out.println("A pilha está vazia.");
                return null;
            }
        }

        public boolean estaVazia() {
            return pilha.isEmpty();
        }
    }

    // Criando veículos e adicionando à pilha
    public class Main {
        public static void main(String[] args) {
            Pilha pilhaVeiculos = new Pilha();

            Veiculo veiculo1 = new Veiculo("ABC-1234", "Toyota", "Corolla", 2020);
            Veiculo veiculo2 = new Veiculo("DEF-5678", "Honda", "Civic", 2018);
            Veiculo veiculo3 = new Veiculo("GHI-9012", "Ford", "Focus", 2021);

            pilhaVeiculos.empilhar(veiculo1);
            pilhaVeiculos.empilhar(veiculo2);
            pilhaVeiculos.empilhar(veiculo3);

            // Desempilhando e exibindo os veículos
            System.out.println("Retirando veículos da pilha:");
            while (!pilhaVeiculos.estaVazia()) {
                Veiculo veiculo = pilhaVeiculos.desempilhar();
                System.out.println(veiculo);
            }
        }
    }

}
