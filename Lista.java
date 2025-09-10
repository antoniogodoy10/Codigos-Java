import java.util.ArrayList;
import java.util.Scanner;

public class Lista
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> string = new ArrayList<>();

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Digite o "+ i + " nome");
            String nomes = sc.nextLine();
            string.add(nomes);
        }

        System.out.println("Digite o nome que deseja encontrar: ");
        String encont = sc.nextLine();

        boolean achou = string.contains(encont);

        if (achou)
        {
            System.out.println("O nome procurado esta na lista");
        }
        else{
            System.out.println("O nome procurado nao esta na lista");
        }


    }

}