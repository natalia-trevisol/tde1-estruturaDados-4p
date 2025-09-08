public class MergeVetor {
    public static FilaVetor merge(FilaVetor A, FilaVetor B) {

        FilaVetor C = new FilaVetor(A.getTamanho() + B.getTamanho());

        int i = 0;
        int j = 0;

        while (i < A.getTamanho() && j < B.getTamanho()) {
            if (A.getElemento(i) <= B.getElemento(j)) {
                C.insere(A.getElemento(i));
                i++;
            } else {
                C.insere(B.getElemento(j));
                j++;
            }
        }

        while (i < A.getTamanho()) {
            C.insere(A.getElemento(i));
            i++;
        }

        while (j < B.getTamanho()) {
            C.insere(B.getElemento(j));
            j++;
        }

        return C;
    }
}
