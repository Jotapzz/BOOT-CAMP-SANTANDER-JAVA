package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        //as vezes podemos simplicar o tratamento com if
        if (nome.isEmpty()) {
            System.out.println("Erro: nome invalido");
        }


        //E as vezes usamos o TryCatch
        try {
            System.out.print("Digite sua idade: ");
            int idade = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Digite uma Idade Valida");
        }



    }
}
