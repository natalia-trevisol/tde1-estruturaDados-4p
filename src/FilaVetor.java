public class FilaVetor {

    private int[] dados;
    private int tamanho;

    public FilaVetor(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
    }

    public void insere(int valor) {
        if (tamanho < dados.length) {
            dados[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public int remove() {
        if (tamanho == 0) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int removido = dados[0];
        for (int i = 0; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        tamanho--;
        return removido;
    }

    public void imprime() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getElemento(int i) {
        return dados[i];
    }
}
