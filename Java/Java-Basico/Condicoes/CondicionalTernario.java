package Condicoes;

import java.util.Random;
import java.util.Scanner;

public class CondicionalTernario {
    public static void main(String[] args) {

        //Instanciando o objeto que vai ser responsavel por ler os dados!
        Scanner input = new Scanner(System.in);

        //armazena o valor lido pelo usuário e atribuir na variavel nome
        System.out.print("Digite seu Nome: ");
        String nome = input.nextLine();


        //Condição ternaria (Uma forma simples de usar a condição (só serve caso utilize apenas um if e else)
        String tamanhoNome = nome.length() > 10 ? "Seu nome é Grande" : "Seu nome é Pequeno";

        //Imprime o Resultado
        System.out.println(tamanhoNome);

        input.close();
    }
}
