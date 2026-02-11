import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];
        int x, cont = 0;

        System.out.println("Preencha o vetor com 5 numeros: ");

        for (int i = 0; i < 5; i++)
        {
           vetor[i] = sc.nextInt();
        }

        System.out.println("Digite um valor para x: ");
        x = sc.nextInt();

        for (int j = 0; j < 5; j++)
        {
            if (x == vetor[j])
            {
                cont++;
            }
        }

        if (cont >= 1)
        {
        System.out.println("O valor de x foi encontrado dentro do vetor");
        }
        else{
            System.out.println("O valor de x nao foi encontrado dentro do vetor");
        }
    }
}
