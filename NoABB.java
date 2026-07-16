public class NoABB {
    Aluno aluno;
    NoABB esquerda, direita;

    public NoABB(Aluno aluno) {
        this.aluno = aluno;
        esquerda = direita = null;
    }
}
