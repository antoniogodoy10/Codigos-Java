import java.util.Scanner;

public class Cripto{

    public static void Mudar(String str){
     for(int i = 0; i < str.length; i++){
       char c = str.charAt(i);
       str.charAt(i) = c + 3;
       }
       return;
    }
    public static void main (String args[]) {

    Scanner sc = new Scanner (System.in);

    String str = sc.nextLine();

    String resultado = Mudar(str);
    
    }
    
}