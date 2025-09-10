import java.util.ArrayList;
import java.util.Scanner;

public class Lista
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        int soma = 0;

        for (int i = 1; i <=5; i++)
        {
            System.out.println("Digite o " + i + " numero");
            int num = sc.nextInt();
            lista.add(num);
        }

        System.out.println(lista);

        for (int num : lista)
        {
           soma += num; 
        }

        System.out.println("A soma dos numeros eh " + soma);

    }
}