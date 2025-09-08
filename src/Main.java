import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        while (true) {
            System.out.println("\n*---------- MENU ----------*");
            System.out.println("\n*** PILHA ***");
            System.out.println("(1) - Inserir elemento na Pilha");
            System.out.println("(2) - Remover elemento da Pilha");
            System.out.println("(3) - Imprimir Pilha");
            System.out.println("\n*** FILA ***");
            System.out.println("(4) - Inserir elemento na Fila");
            System.out.println("(5) - Remover elemento da Fila");
            System.out.println("(6) - Imprimir Fila");
            System.out.println("\n*** MERGE ***");
            System.out.println("(7) - Merge com Listas Encadeadas");
            System.out.println("(8) - Merge com Vetores");
            System.out.println("(9) - Sair");
            System.out.print("\nEscolha uma opção: ");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o elemento a ser inserido na pilha: ");
                int valor = sc.nextInt();
                pilha.insere(valor);

            } else if (opcao == 2) {
                ListaEncadeada.Node removido = pilha.remove();
                System.out.println("Elemento removido da pilha: " + removido);

            } else if (opcao == 3) {
                pilha.imprime();

            } else if (opcao == 4) {
                System.out.print("Digite o elemento a ser inserido na fila: ");
                int valor = sc.nextInt();
                fila.insere(valor);

            } else if (opcao == 5) {
                ListaEncadeada.Node removido = fila.remove();
                System.out.println("Elemento removido da fila: " + removido);

            } else if (opcao == 6) {
                fila.imprime();

            } else if (opcao == 7) {
                System.out.print("Digite quantidade de elementos da Fila A: ");
                int nA = sc.nextInt();
                Fila A = new Fila();
                for (int i = 0; i < nA; i++) {
                    System.out.print("Digite valor (ordenado) para A: ");
                    A.insere(sc.nextInt());
                }

                System.out.print("Digite quantidade de elementos da Fila B: ");
                int nB = sc.nextInt();
                Fila B = new Fila();
                for (int i = 0; i < nB; i++) {
                    System.out.print("Digite valor (ordenado) para B: ");
                    B.insere(sc.nextInt());
                }

                Fila C = MergeLista.merge(A, B);
                System.out.println("Resultado do Merge (Lista Encadeada):");
                C.imprime();

            } else if (opcao == 8) {
                System.out.print("Digite quantidade de elementos da Fila A: ");
                int nA = sc.nextInt();
                FilaVetor A = new FilaVetor(nA);
                for (int i = 0; i < nA; i++) {
                    System.out.print("Digite valor (ordenado) para A: ");
                    A.insere(sc.nextInt());
                }

                System.out.print("Digite quantidade de elementos da Fila B: ");
                int nB = sc.nextInt();
                FilaVetor B = new FilaVetor(nB);
                for (int i = 0; i < nB; i++) {
                    System.out.print("Digite valor (ordenado) para B: ");
                    B.insere(sc.nextInt());
                }

                FilaVetor C = MergeVetor.merge(A, B);
                System.out.println("Resultado do Merge (Vetores):");
                C.imprime();

            } else if (opcao == 9) {
                System.exit(0);
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
