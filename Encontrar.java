import java.util.ArrayList;
import java.util.Scanner;

public class Encontrar{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < 10;i++)
        {
            vetor[i] = sc.nextInt();
        }

        System.out.println("Digite o valor que deseja encontrar: ");
        int num = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 10; i++)
        {
            if (num == vetor[i])
            {
                encontrado = true;
            }
        }

        if (encontrado)
        {
           System.out.println("O numero " + num + " foi encontrado no vetor");
        }
        else {
            System.out.println("O numero " + num + "nao esta no vetor");
        }

    }
}