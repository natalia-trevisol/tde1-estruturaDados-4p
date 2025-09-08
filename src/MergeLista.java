public class MergeLista {
    public static Fila merge(Fila A, Fila B) {

        Fila C = new Fila();

        ListaEncadeada.Node noA = A.getPrimeiro();
        ListaEncadeada.Node noB = B.getPrimeiro();

        while (noA != null && noB != null) {
            if (noA.valor <= noB.valor) {
                C.insere(noA.valor);
                noA = noA.proximo;
            } else {
                C.insere(noB.valor);
                noB = noB.proximo;
            }
        }

        while (noA != null) {
            C.insere(noA.valor);
            noA = noA.proximo;
        }

        while (noB != null) {
            C.insere(noB.valor);
            noB = noB.proximo;
        }

        return C;
    }
}
