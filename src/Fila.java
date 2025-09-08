public class Fila {

    private ListaEncadeada lista;

    public Fila() {
        lista = new ListaEncadeada();
    }

    public void insere(int valor) {
        lista.insereUltimo(valor); //no final
    }

    public ListaEncadeada.Node remove() {
        return lista.removePrimeiro(); // início
    }

    public void imprime() {
        System.out.println("Fila:");
        lista.imprime();
    }

    public ListaEncadeada.Node getPrimeiro() {
        return lista.getPrimeiro();
    }
}

