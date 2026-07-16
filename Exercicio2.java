public class Exercicio2 {
    public static void main(String[] args) {
        ABB arvore = new ABB();

        arvore.inserir(new Aluno("Carlos", 2023001));
        arvore.inserir(new Aluno("Ana", 2023002));
        arvore.inserir(new Aluno("Bruno", 2023003));
        arvore.inserir(new Aluno("Daniela", 2023004));
        arvore.inserir(new Aluno("Eduardo", 2023005));

        System.out.println("Alunos em ordem alfabética:");
        arvore.emOrdem();
    }
}
