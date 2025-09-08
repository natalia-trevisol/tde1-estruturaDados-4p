# TDE 01 – Manipulação de Pilhas, Filas Dinâmicas e Merge

Atividade da disciplina **Resolução de Problemas Estruturados em Computação** – Ciência da Computação - PUCPR.  
**Aluna:** Natalia Moritani Trevisol  
**Turma:** B - manhã

---

## Descrição
Este trabalho implementa:

1. **Pilha dinâmica (Lista Encadeada)** com métodos:
   - `insere` (push)
   - `remove` (pop)
   - `imprime` (listar elementos)

2. **Fila dinâmica (Lista Encadeada)** com métodos:
   - `insere` (enqueue)
   - `remove` (dequeue)
   - `imprime` (listar elementos)

3. **Merge de duas filas ordenadas:**
   - Versão com listas encadeadas
   - Versão com vetores

## Como Executar

### Requisitos
- Java JDK 11 ou superior
- Terminal ou IDE (IntelliJ, Eclipse, VSCode)

### Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/natalia-trevisol/tde1-estruturaDados-4p.git
2. Entre na pasta:
   ```bash
   cd tde1-estruturaDados-4p
3. Compile todos os arquivos:
   ```bash
   javac *.java
4. Execute o programa:
   ```bash
   java Main

### Menu do programa
Ao executar, você verá o seguinte menu interativo:

*---------- MENU ----------*

*** PILHA ***

(1) - Inserir elemento na Pilha

(2) - Remover elemento da Pilha

(3) - Imprimir Pilha

*** FILA ***

(4) - Inserir elemento na Fila

(5) - Remover elemento da Fila

(6) - Imprimir Fila

*** MERGE ***

(7) - Merge com Listas Encadeadas

(8) - Merge com Vetores

(9) - Sair

## Exemplos de uso

**Pilha:**

Escolha uma opção: 1

Digite o elemento a ser inserido na pilha: 1

Escolha uma opção: 1

Digite o elemento a ser inserido na pilha: 2

Escolha uma opção: 1

Digite o elemento a ser inserido na pilha: 3

Escolha uma opção: 3

Pilha:

3 -> 

2 -> 

1 -> 

Null

Escolha uma opção: 2

Elemento removido da pilha: 3

Escolha uma opção: 3

Pilha:

2 -> 

1 -> 
Null

**Fila:**

Escolha uma opção: 4

Digite o elemento a ser inserido na fila: 1

Escolha uma opção: 4

Digite o elemento a ser inserido na fila: 2

Escolha uma opção: 4

Digite o elemento a ser inserido na fila: 3

Escolha uma opção: 6

Fila:

1 -> 

2 -> 

3 -> 

Null

Escolha uma opção: 5

Elemento removido da fila: 1

Escolha uma opção: 6

Fila:

2 -> 

3 -> 

Null

**Merge com Lista Encadeada:**

Escolha uma opção: 7

Digite quantidade de elementos da Fila A: 3

Digite valor (ordenado) para A: 1

Digite valor (ordenado) para A: 2

Digite valor (ordenado) para A: 5

Digite quantidade de elementos da Fila B: 2

Digite valor (ordenado) para B: 4

Digite valor (ordenado) para B: 6

Resultado do Merge (Lista Encadeada):

Fila:

1 -> 

2 -> 

4 -> 

5 -> 

6 -> 

Null

**Merge com Vetor:**

Escolha uma opção: 8

Digite quantidade de elementos da Fila A: 2

Digite valor (ordenado) para A: 5

Digite valor (ordenado) para A: 7

Digite quantidade de elementos da Fila B: 4

Digite valor (ordenado) para B: 2

Digite valor (ordenado) para B: 4

Digite valor (ordenado) para B: 6

Digite valor (ordenado) para B: 8

Resultado do Merge (Vetores):

2 4 5 6 7 8 

### Observações

Não foram utilizadas funções prontas do Java (como ArrayList, Vector, etc).

Estruturas implementadas manualmente com tipos primitivos e lista encadeada.
