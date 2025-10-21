import java.util.Scanner;

public class Main
{
   public static void main(String[] args) {

      Scanner sc = new Scanner (System.in);
    
      System.out.println("Digite uma frase: ");
      String frase = sc.nextLine();

      String[] palavras = frase.split(" ");

      String resultado = "";

      for (int i = palavras.length - 1; i >= 0; i--)
      {
         String teste = palavras[i];
         String invertido = new StringBuilder(teste).reverse().toString();
         resultado += invertido + " ";

      }

      System.out.println(resultado);

   }
}  
