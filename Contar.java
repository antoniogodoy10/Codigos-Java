import java.util.Scanner;
public class Contar
{
    public static int contar (String str, int cont)
    {
       for (int i = 0; i < str.length(); i++)
       {
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
        {
            cont++;
        }
       }
       return cont;
    }
    public static void main (String[] args)
    {
       Scanner sc = new Scanner (System.in);
       String str = sc.nextLine();
       int cont = 0;
       int resultado = contar(str, cont);
       System.out.println("Quantidade de maiúsculas: " + resultado);
    }
}
