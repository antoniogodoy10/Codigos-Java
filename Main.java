import java.util.Scanner;

public class Main
{
    public static int contarVogais(String s)
    {
        int cont = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                cont++;
            }
        }

        return cont;
    }
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String linha = sc.nextLine();

    while (!linha.equals("FIM"))
    {
        int qtd = contarVogais(linha);
        System.out.println(qtd);
        linha = sc.nextLine();
    }
   }

}