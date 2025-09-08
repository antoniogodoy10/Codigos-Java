import java.util.ArrayList;
import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;

    Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void mostrarDados() {
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
    }
}


public class TestePessoa{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        Pessoa p = new Pessoa(nome, idade);

        System.out.println("\nMostrar dados:\n");
        p.mostrarDados();
        
        
        
        }

    }
