public class Main {
    public static void main(String[] args) {
        ListaLinear lista = new ListaLinear(5);

        lista.inserirFim(10);
        lista.inserirFim(20);
        lista.inserirInicio(5);
        lista.inserir(15, 2);

        lista.mostrar(); // [ 5 10 15 20 ]

        System.out.println("Remove início: " + lista.removerInicio());
        System.out.println("Remove fim: " + lista.removerFim());
        lista.mostrar(); // [ 10 15 ]

        System.out.println("Pesquisar 15: " + lista.pesquisar(15));
        System.out.println("Pesquisar 50: " + lista.pesquisar(50));

        lista.remover(0);
        lista.mostrar(); // [ 15 ]
    }
}
