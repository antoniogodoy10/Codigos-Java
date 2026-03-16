import java.util.*;
public class Exercicio3
{
    //criação do metodo Inteiros
    public static boolean Inteiros(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            //condição para ver se o numero é inteiro
            if (c >= '0' && c <= '9')
            {
                return true;
            }
        }
        return false;
    }
    //criação do metodo Consoantes 
    public static boolean Consoantes(String str){
        for (int i = 0; i < str.length(); i++)
      {
        char c = str.charAt(i);
        //condição para ver se tem vogal
       if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            return false;
        }
        //condição para se tiver numeros, o metodo Consoantes retornar falso
       if (c >= '0' && c <= '9')
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
            System.out.print("SIM ");
        }

        else
        {
            System.out.print("NAO ");
        }
        //condição para ver se o metodo Consoantes retornou true ou false
        if (Consoantes(str))
        {
            System.out.print("SIM ");
        }

        else
        {
            System.out.print("NAO ");
        }
         //condição para ver se Inteiros retornou false ou true  
        if (Inteiros(str))
        {
            System.out.print("SIM ");
        }

        else
        {
            System.out.print("NAO ");
        }
           str = sc.nextLine(); 
    }
}
}

