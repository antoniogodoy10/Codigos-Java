public class ListaLinear {
    private int[] elementos;
    private int tamanho;
    private int max;

    // Construtor
    public ListaLinear(int max) {
        this.max = max;
        this.elementos = new int[max];
        this.tamanho = 0;
    }

    // Inserir no início
    public void inserirInicio(int elem) {
        if (tamanho >= max)
            throw new RuntimeException("Erro: overflow (lista cheia)");
        
        // desloca tudo para a direita
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = elem;
        tamanho++;
    }

    // Inserir no fim
    public void inserirFim(int elem) {
        if (tamanho >= max)
            throw new RuntimeException("Erro: overflow (lista cheia)");
        
        elementos[tamanho++] = elem;
    }

    // Inserir em posição específica
    public void inserir(int elem, int pos) {
        if (tamanho >= max)
            throw new RuntimeException("Erro: overflow (lista cheia)");
        if (pos < 0 || pos > tamanho)
            throw new RuntimeException("Posição inválida");
        
        for (int i = tamanho; i > pos; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[pos] = elem;
        tamanho++;
    }

    // Remover do início
    public int removerInicio() {
        if (tamanho == 0)
            throw new RuntimeException("Erro: underflow (lista vazia)");
        
        int elem = elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elem;
    }

    // Remover do fim
    public int removerFim() {
        if (tamanho == 0)
            throw new RuntimeException("Erro: underflow (lista vazia)");
        
        return elementos[--tamanho];
    }

    // Remover em posição específica
    public int remover(int pos) {
        if (tamanho == 0)
            throw new RuntimeException("Erro: underflow (lista vazia)");
        if (pos < 0 || pos >= tamanho)
            throw new RuntimeException("Posição inválida");
        
        int elem = elementos[pos];
        for (int i = pos; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elem;
    }

    // Mostrar elementos
    public void mostrar() {
        System.out.print("[ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println("]");
    }

    // Pesquisar elemento
    public boolean pesquisar(int elem) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elem)
                return true;
        }
        return false;
    }
}
