import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Enquanto houver casos de teste
        while (sc.hasNextInt()) {
            int N = sc.nextInt(); // número de competidores

            int[] largada = new int[N];
            int[] chegada = new int[N];
            int[] posicaoChegada = new int[N + 1]; 
            // usamos N+1 porque os competidores vão de 1 até N

            // Leitura do grid de largada
            for (int i = 0; i < N; i++) {
                largada[i] = sc.nextInt();
            }

            // Leitura do grid de chegada
            for (int i = 0; i < N; i++) {
                chegada[i] = sc.nextInt();
                posicaoChegada[chegada[i]] = i; 
                // guarda a posição final de cada competidor
            }

            // Agora criamos o vetor 'ordem' com base nas posições de chegada
            int[] ordem = new int[N];
            for (int i = 0; i < N; i++) {
                ordem[i] = posicaoChegada[largada[i]];
            }

            // Contar inversões (ultrapassagens)
            int ultrapassagens = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (ordem[i] > ordem[j]) {
                        ultrapassagens++;
                    }
                }
            }

            System.out.println(ultrapassagens);
        }

        sc.close();
    }
}
