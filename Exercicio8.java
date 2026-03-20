import java.util.*;

public class Exercicio8{

    public static boolean Caractere(String str)
    {
        int contCaractere = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (c == '!' || c == '@' || c == '#' || c == '$' || c == '^')
            {
                contCaractere++;
            }
        }
        if (contCaractere >= 1)
        {
            return true;
        }
        return false;
    }

    public static boolean Numero(String str)
{
    int contN = 0;

    for (int i = 0; i < str.length(); i++)
    {
       char c = str.charAt(i);
       if (c >= '0' && c <= '9')
       {
        contN++;
       }
    }
    if (contN >= 1)
    {
        return true;
    }
    return false;
}

public static boolean Minuscula(String str)
{
    int contMinuscula = 0;

    for (int i = 0; i < str.length(); i++)
    {
       char c = str.charAt(i);
       if (c >= 'a' && c <= 'z')
       {
        contMinuscula++;
       }
    }
    if (contMinuscula >= 1)
    {
        return true;
    }
    return false;
}

public static boolean Maiuscula(String str)
{
    int contMaiuscula = 0;
    int cont = 0;

    for (int i = 0; i < str.length(); i++)
    {
        cont++;
      char c = str.charAt(i);
      if (c >= 'A' && c <= 'Z')
      {
        contMaiuscula++;
      }
    }
    if (cont >= 8 && contMaiuscula >= 1)
    {
        return true;
    }
    return false;
}

public static boolean Senha(String str){

    if (Maiuscula(str) && Minuscula(str) && Numero(str) && Caractere(str))
    {
        return true;
    }
    return false;
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String str = sc.nextLine();
        while(!str.equals("FIM"))
    {
        if(Senha(str))
        {
            System.out.println("SIM");
        }
        else 
        {
            System.out.println("NAO");
        }
    }
}
}