import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String normal = "";
        String espelho = "";

        int inicio = sc.nextInt();
        int fim = sc.nextInt();


        for (int i = inicio; i <= fim; i++)
        {
            normal = normal + i;
        }

        for (int j = fim; j >= inicio; j--)
        {
            String num = String.valueOf(j);
            String invertido = new StringBuilder(num).reverse().toString();
            espelho = espelho + invertido;
        }

        System.out.println(normal + espelho);
}
}