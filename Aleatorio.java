import java.util.*;
public class Aleatorio {

    public static String AlteraString(String str1){
    String str2 = " ";

     Random gerador = new Random();
        gerador.setSeed(4);

    char letra1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
    char letra2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
    }
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    String str1 = sc.nextLine();
    
    String resultado = AlteraString(str1);





    }
}
