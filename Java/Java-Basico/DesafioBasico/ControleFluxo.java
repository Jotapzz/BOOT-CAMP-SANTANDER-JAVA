package DesafioBasico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tratando Possiveis erros
        try {
            System.out.print("Digite um número: ");
            int numero1 = input.nextInt();
            System.out.print("Digite outro número: ");
            int numero2 = input.nextInt();

            verificarLoop(numero1, numero2); //utilizando o metodo criado

            //Laço for de acordo com o valor digitado
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }

            //Caso de o erro:
        } catch (InputMismatchException e) {
            System.out.println("Digite um número valido");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Ops.. não foi possivel continuar pois o segundo número é maior que o primeiro");
        }

        input.close();
    }


    //Metodo que pega os valores digitado como parametro e verifica se o primeiro é maior que o segundo
     static void verificarLoop  (int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();  //Chama a exceção
        }
    }
}
