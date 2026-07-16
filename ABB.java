

public class ABB {
    private NoABB raiz;

    public void inserir(Aluno aluno) {
        raiz = inserirRec(raiz, aluno);
    }

    private NoABB inserirRec(NoABB no, Aluno aluno) {
        if (no == null) {
            return new NoABB(aluno);
        }
        if (aluno.compareTo(no.aluno) < 0) {
            no.esquerda = inserirRec(no.esquerda, aluno);
        } else {
            no.direita = inserirRec(no.direita, aluno);
        }
        return no;
    }

    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(NoABB no) {
        if (no != null) {
            emOrdemRec(no.esquerda);
            System.out.println(no.aluno);
            emOrdemRec(no.direita);
        }
    }
}
