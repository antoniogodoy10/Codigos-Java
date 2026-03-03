import java.util.Scanner;

public class Soma
{
    public static int soma (int x, int y)
    {
       return x + y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite dois valores: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int resultado = soma(x, y);
        System.out.println("Resultado: " + resultado);
    }
}
