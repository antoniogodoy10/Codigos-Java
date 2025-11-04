class No {
     public int elemento;
     public int freq;
     public No esq, dir;
     public No(int x)
     {
        elemento = x;
        freq = 1;
     }
}

public class Arvores {
    private No raiz;

    public void inserir(int x)
    {
        if (raiz == null)
        {
            raiz = new No(x);
            return;
        }

        No atual = raiz;
        while(true)
        {
            if (x < atual.elemento)
            {
                if (atual.esq == null)
                {
                    atual.esq = new No(x);
                    break;
                }
                atual = atual.esq;
            }
            else if (x > atual.elemento)
            {
                if (atual.dir == null)
                {
                    atual.dir = new No(x);
                    break;
                }
                atual = atual.dir;
            }

            else 
            {
                atual.freq++;
                break;
            }
        }
    }
}
