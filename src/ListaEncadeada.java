public class ListaEncadeada {

    private Node Lista; //primeiro nó ou head

    public ListaEncadeada(){
        Lista = null;
    }

    public static class Node {

        int valor;  //dado
        Node proximo; //representa ponteiro

        public Node(int valor) {
            this.proximo = null;
            this.valor = valor;
        }
        @Override
        public String toString() {
            return String.valueOf(valor);
        }
    }

    public boolean vazia() {
        return Lista == null;
    }

    public void inserePrimeiro(int valor) {
        Node novo = new Node(valor);
        novo.proximo = Lista;
        Lista = novo;
    }
    public void insereDepois(int index, int valor) { //depois de um nó específico
        Node no = getNode(index);
        if (no == null) {
            return;
        }
        Node novo = new Node(valor);
        novo.proximo = no.proximo;
        no.proximo = novo;
    }

    public void insereUltimo(int valor) {
        Node novo = new Node(valor);
        if (Lista == null) {
            Lista = novo;
        }
        else {
            Node ultimo = Lista;
            while (ultimo.proximo != null) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novo;
        }
    }

    public void insereOrdenado(int valor) { //ordem crescente
        Node novo = new Node(valor);
        if (Lista == null || valor < Lista.valor){ //lista vazia ou valor menor que o primeiro
            novo.proximo = Lista;
            Lista = novo;
            return;
        }
        //procura posicao
        Node auxiliar = Lista;
        while (auxiliar.proximo != null && auxiliar.proximo.valor < valor) {
            auxiliar = auxiliar.proximo;
        }
        novo.proximo = auxiliar.proximo;
        auxiliar.proximo = novo;
    }

    public void imprime() {
        Node auxiliar = Lista;
        while (auxiliar != null) {
            System.out.println(auxiliar.valor + " -> ");
            auxiliar = auxiliar.proximo;
        }
        System.out.println("Null");
    }

    public Node removeUltimo() {
        if (Lista == null) {
            return null;
        }
        if (Lista.proximo == null) {
            Node removido = Lista;
            Lista = null;
            return removido;
        }

        Node auxiliar = Lista;
        while (auxiliar.proximo.proximo != null) { //para no penultimo
            auxiliar = auxiliar.proximo;
        }
        Node removido = auxiliar.proximo; //ultimo nó
        auxiliar.proximo = null;
        return removido;
    }

    public Node removePrimeiro() {
        if (Lista == null) {
            return null;
        }
        Node removido = Lista;
        Lista = Lista.proximo;
        removido.proximo = null;
        return removido;
    }

    public Node remove(int index) {
        if (Lista == null || index < 0) {
            return null;
        }
        if (index == 0) { //se for o primeiro
            Lista = Lista.proximo;
            return removePrimeiro();
        }
        Node anterior = getNode(index - 1);
        if (anterior != null && anterior.proximo != null) {
            Node removido = anterior.proximo;
            anterior.proximo = removido.proximo;
            removido.proximo = null; //nó isolado
            return removido;
        }
        return null;
    }

    public Node getPrimeiro() {
        return Lista;
    }

    private Node getNode(int index){
        if (index < 0) {
            return null;
        }
        Node auxiliar = Lista;
        int contador = 0;

        while (auxiliar != null && contador < index) {
            auxiliar = auxiliar.proximo;
            contador++;
        }
        return auxiliar;
    }
}