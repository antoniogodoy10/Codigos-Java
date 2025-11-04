class No {
    public int elemento;
    public int freq;
    public No esq, dir;
    public No(int x){ elemento = x; freq = 1; }
}

public class Arvore {
    private No raiz;

    public void inserir(int x) {
        if (raiz == null) {                // árvore vazia
            raiz = new No(x);
            return;
        }
        No atual = raiz;
        while (true) {
            if (x < atual.elemento) {
                if (atual.esq == null) {   // achou posição
                    atual.esq = new No(x);
                    break;
                }
                atual = atual.esq;         // continua descendo
            } else if (x > atual.elemento) {
                if (atual.dir == null) {
                    atual.dir = new No(x);
                    break;
                }
                atual = atual.dir;
            } else {                       // x == elemento
                atual.freq++;              // só incrementa contagem
                break;
            }
        }
    }

    // (opcional) ver árvore em-ordem
    public void mostrarInOrdem(){ mostrar(raiz); System.out.println(); }
    private void mostrar(No i){
        if(i!=null){ mostrar(i.esq); System.out.print(i.elemento+"("+i.freq+") "); mostrar(i.dir); }
    }
}
