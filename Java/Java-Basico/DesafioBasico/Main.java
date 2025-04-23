package DesafioBasico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciando o Objeto que vai ler nossos Dados
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o Ano que você nasceu: ");
        int ano = input.nextInt();

        if ((ano < 1920) || (ano > 2026)) {
            System.out.println("Digite uma data valida!");
        }
        else {
            int idade = 2025 - ano;
            System.out.printf("Olá %s você tem %d anos!",nome,idade);
        }

        input.close();
    }
}
