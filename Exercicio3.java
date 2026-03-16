import java.util.*;
public class Exercicio3
{
    public static boolean Consoantes(String str){
        for (int i = 0; i < str.length(); i++)
      {
        char c = str.charAt(i);
        //condição para ver se tem vogal
       if (c == 'a' && c == 'e' && c == 'i' && c == 'o' && c == 'u' &&
            c == 'A' && c == 'E' && c == 'I' && c == 'O' && c == 'U')
        {
            return false;
        }
      }
      return true;
    }
    
    //criação metodo Vogais
    public static boolean Vogais(String str){
        //percorre a string str
      for (int i = 0; i < str.length(); i++)
      {
        char c = str.charAt(i);
        //condição para ver se tem vogal
       if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
            c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')
        {
            return false;
        }
      }
      return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         String str = sc.nextLine();
        
        while (!str.equals("FIM")){
        //condição para ver se o metodo Vogais retornou true ou false
        if (Vogais(str))
        {
            System.out.println("SIM");
        }

        else
        {
            System.out.println("NAO");
        }

        if (Consoantes(str))
        {
            System.out.println("SIM");
        }

        else
        {
            System.out.println("NAO");
        }
           str = sc.nextLine(); 
    }
}
}

