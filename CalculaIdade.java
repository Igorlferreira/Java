import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebe o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        // Recebe a data de nascimento
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        
        LocalDate dataNascimento = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Valida a data de nascimento
        try {
            dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
            return;
        }
        
        // Obtém a data atual
        LocalDate hoje = LocalDate.now();
        
        // Calcula a idade
        Period periodo = Period.between(dataNascimento, hoje);
        int idade = periodo.getYears();
        
        // Exibe o resultado
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        
        scanner.close();
    }
}