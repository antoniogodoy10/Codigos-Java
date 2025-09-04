import java.util.ArrayList;

public class master {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Fernanda"); 
        lista.add("Leo");
        lista.add("Antonio");

       /* for (int i = 0; i < lista.size(); i++)
       {
        System.out.println(lista.get(i));
       }
       */

       for (String nomes : lista)
       {
        System.out.println(nomes);
       }
    }
    

   

    
    
}
