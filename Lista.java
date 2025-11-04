class Lista {
    CelulaLista inicio;
    CelulaLista fim;

    public CelulaLista maiorPilha()
    {
        if (inicio == null)
        {
            return null;
        }

        CelulaLista atual = inicio;
        CelulaLista maiortam = inicio;
        int maiorTam = contarPilha(inicio.topo);

        while (atual != null)
        {
            int tamAtual = contarPilha(atual.topo);

            if (tamAtual > maiorTam)
            {
                maiorTam = tamAtual;
                maiorCelula = atual;
            }

            atual = atual.prox;
        }

        return maiorCelula;
    }

    private int contarPilha(CelulaPilha topo)
    {
        int cont = 0;
        CelulaPilha p = topo;
        while (p != null)
        {
            cont++;
            p = p.prox;
        }
        return cont;
    }

}
