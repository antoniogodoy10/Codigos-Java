import java.util.ArrayList;
import java.util.Scanner;

public class Notas{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float[] vetor = new float[5];

        float soma = 0, media = 0;

        for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = sc.nextFloat();
            soma += vetor[i];
        }

        media = soma / 5;

        System.out.println("A media das notas eh "+ media);
    }
}