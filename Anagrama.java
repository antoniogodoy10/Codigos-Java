import java.util.Scanner;
import java.util.Arrays;

public class Anagrama {
    
    // Função que verifica se duas strings são anagramas
    public static boolean ehAnagrama(String s1, String s2) {
        // Normaliza para minúsculas
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Se tamanhos diferentes → não são anagramas
        if (s1.length() != s2.length()) {
            return false;
        }

        // Converte para array de caracteres
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Ordena os dois arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Compara se os arrays ordenados são iguais
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String linha = sc.nextLine();   // lê a linha completa (ex.: "Escuta - Custa")

            if (linha.equals("FIM")) {
                break; // encerra quando encontrar "FIM"
            }

            // Divide a linha no " - " (duas strings)
            String[] partes = linha.split(" - ");
            String string1 = partes[0];
            String string2 = partes[1];

            if (ehAnagrama(string1, string2)) {
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }
        }

        sc.close();
    }
}
