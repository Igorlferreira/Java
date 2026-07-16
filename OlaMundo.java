package olamundo;


public class OlaMundo {

    
    public static void main(String[] args) {
        System.out.println("Olá mundo com Netbeans");
        float a = 9, b = 5, res = 0;
        res = a + b;
        System.out.println("A soma vale: " + res);
        
        // Vamos criar três objetos da classe trabalhador:
        Trabalhador trab1 = new Trabalhador("Ana Lopes", 4500, 'F');
        Trabalhador trab2 = new Trabalhador("Caio Henrique ", 19500, 'M');
        Trabalhador trab3 = new Trabalhador("Julia", 7500, 'F');
        
        // E agora vamos visualizar os três trabalhadores
        System.out.println(trab1.toString());
        System.out.println(trab2.toString());
        System.out.println(trab3.toString());
    }
    
}
