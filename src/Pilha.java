public class Pilha {

    private ListaEncadeada lista;

    public Pilha() {
        lista = new ListaEncadeada();
    }

    public void insere(int valor) {
        lista.inserePrimeiro(valor); //no topo
    }

    public ListaEncadeada.Node remove() {
        return lista.removePrimeiro(); //do topo
    }

    public void imprime() {
        System.out.println("Pilha:");
        lista.imprime();
    }
}
