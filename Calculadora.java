import java.util.ArrayList;
import java.util.Scanner;

class Calcular{
    int n1, n2;

    Calcular (int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    void Soma ()
    {
       int soma = n1 + n2;
       System.out.println("A soma dos digitos eh:\n" + soma);
    }

    void Subtracao ()
    {
        int sub = n1 - n2;
        System.out.println("A subtracao dos digitos eh:\n " + sub);
    }

    void Mult ()
    {
        int mult = n1 * n2;
        System.out.println("A multiplicacao dos digitos eh:\n " + mult);
    }

    void Div ()
    {
        int div = n1 / n2;
        System.out.println("A divisao dos digitos eh:\n " + div);
    }

}

public class Calculadora{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        Calcular c = new Calcular(n1, n2);

        c.Soma();
        c.Subtracao();
        c.Mult();
        c.Div();



    }
}