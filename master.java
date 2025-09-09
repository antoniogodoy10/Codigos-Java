import java.util.ArrayList;
import java.util.Scanner;

class ContaBancaria
{
    String titular;
    double saldo;

    void Depositar(double valor)
    {
       saldo += valor;
    }

    void Sacar (double valorsac)
    {
        if (valorsac <= saldo)
        {
            saldo -= valorsac;
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }
    }
}

public class master {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();

        c.titular = "Antonio";
        c.saldo = 100;
        
        c.Depositar(50);
        c.Sacar(70);

        System.out.println("Titular : " + c.titular);
        System.out.println("Saldo: " + c.saldo);

    }
}
