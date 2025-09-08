import java.util.ArrayList;
import java.util.Scanner;

public class Maior{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

         System.out.println("Digite o segundo numero: ");
         int n2 = sc.nextInt();

          System.out.println("Digite o terceiro numero: ");
          int n3 = sc.nextInt();

          int maior = n1;

          if (n1 < n2 && n2 > n3)
          {
            maior = n2;
          }
          if (n1 < n3 && n3 > n2)
          {
            maior = n3;
          }

          System.out.println("O maior numero eh " + maior);
    }
}

    

   

    
    

