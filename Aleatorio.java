import java.util.*;
public class Aleatorio {

    public static String AlteraString(String str1){
    String str2 = " ";

     Random gerador = new Random();
        gerador.setSeed(4);

    char letra1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
    char letra2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

    for (int i = 0; i < str1.length(); i++)
    {
        char c = str1.charAt(i);

        if (c == letra1)
        {
            str2 += letra2;
        }
        else
        {
            str2 += c;
        }
    }

    return str2;
    }
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    String str1 = sc.nextLine();
    
    String resultado = AlteraString(str1);

    System.out.println(resultado);

    }
}
