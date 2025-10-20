import java.util.Scanner;

public class Main
{
    public static int contarMaiuculas(String s)
    {
        int contador = 0;
       for (int i = 0; i < s.length(); i++)
       {
              char c = s.charAt(i);
              if (c >= 'A' && c <= 'Z')
              {
                contador++;
              }
       }

       return contador;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String linha = sc.nextLine();

        while (!linha.equals("FIM"))
        {
            int qtd = contarMaiuculas(linha);
            System.out.println(qtd);
            linha = sc.nextLine();
        }
    }
}