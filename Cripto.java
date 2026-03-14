import java.util.Scanner;

public class Cripto{

    public static String Mudar(String str){
       String novaString = " ";
       for(int i = 0; i < str.length(); i++){
       char c = str.charAt(i);
       novaString = novaString + (char)(c + 3);
       }
       return novaString;
    }
    public static void main (String args[]) {
    //declaração do scanner
    Scanner sc = new Scanner (System.in);

    String str = sc.nextLine();

    String resultado = Mudar(str);
    System.out.println(resultado);
    }
    
}