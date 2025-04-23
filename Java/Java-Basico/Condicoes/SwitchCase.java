package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Instanciando o Objeto que vai ser responsavel por ler os dados
        Scanner input = new Scanner(System.in);

        //Variaveis
        int numero1;
        int numero2;
        int resultado;

        // while uma estrutura de Repetição
        while (true) {
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");  //Menu
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            //Pega a opção que o usuário digitar
            System.out.print("Escolha a opção: ");
            int opcao = input.nextInt();


            //Estrutura Switch case (faça (condicao) caso for isso: faça isso e assim vai)
            switch (opcao) {
                case 1:
                    System.out.print("Digite um Valor: ");
                    numero1 = input.nextInt();
                    System.out.print("Digite um segundo número: ");
                    numero2 = input.nextInt();

                    resultado = numero1 + numero2;
                    System.out.printf("%d + %d = %d\n", numero1, numero2, resultado);
                    break;

                case 2:
                    System.out.print("Digite um Valor: ");
                    numero1 = input.nextInt();
                    System.out.print("Digite um segundo número: ");
                    numero2 = input.nextInt();

                    resultado = numero1 - numero2;
                    System.out.printf("%d - %d = %d\n", numero1, numero2, resultado);
                    break;

                case 3:
                    System.out.print("Digite um Valor: ");
                    numero1 = input.nextInt();
                    System.out.print("Digite um segundo número: ");
                    numero2 = input.nextInt();

                    resultado = numero1 * numero2;
                    System.out.printf("%d x %d = %d\n", numero1, numero2, resultado);
                    break;

                case 4:
                    System.out.print("Digite um Valor: ");
                    numero1 = input.nextInt();
                    System.out.print("Digite um segundo número: ");
                    numero2 = input.nextInt();

                    if (numero2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.printf("%d / %d = %d\n", numero1, numero2, resultado);
                    }
                    break;

                case 5:
                    input.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
