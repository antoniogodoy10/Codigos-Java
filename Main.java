import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // número de casos de teste

        for (int caso = 0; caso < N; caso++) {
            int M = sc.nextInt(); // número de alunos
            int[] notas = new int[M];
            int[] copia = new int[M];

            // leitura das notas
            for (int i = 0; i < M; i++) {
                notas[i] = sc.nextInt();
                copia[i] = notas[i]; // guarda cópia original
            }

            // ordenação decrescente manual (Bubble Sort)
            for (int i = 0; i < M - 1; i++) {
                for (int j = 0; j < M - 1 - i; j++) {
                    if (notas[j] < notas[j + 1]) {
                        int aux = notas[j];
                        notas[j] = notas[j + 1];
                        notas[j + 1] = aux;
                    }
                }
            }

            // contar quantos ficaram na mesma posição
            int iguais = 0;
            for (int i = 0; i < M; i++) {
                if (notas[i] == copia[i]) {
                    iguais++;
                }
            }

            System.out.println(iguais);
        }

        sc.close();
    }
}
