import java.util.ArrayList;
import java.util.Scanner;

public class Tabuada{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 10: ");
        int num = sc.nextInt();

        for (int i = 0; i < 11; i++)
        {
            int result = 0;
            result = i * num;
            System.out.println(result);
        }
    }
}

    

   

    
    

