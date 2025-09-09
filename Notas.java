import java.util.ArrayList;
import java.util.Scanner;

class CalcularNotas
{
    String nome;
    double nota1, nota2;

    void CalcularMedia (String nome, double nota1, double nota2) {

        double media = (nota1 + nota2) / 2;

        System.out.println("Nome: " + nome);
        System.out.println("Media: " + media);
    }
}

public class Notas
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CalcularNotas c = new CalcularNotas();

        System.out.println("Digite seu nome: ");
        c.nome = sc.nextLine();

        System.out.println("Digite a sua primeira nota: ");
        c.nota1 = sc.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        c.nota2 = sc.nextDouble();

        c.CalcularMedia(c.nome, c.nota1, c.nota2);

       

    }
}