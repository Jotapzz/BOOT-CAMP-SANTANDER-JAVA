package Operadores;

public class OperadoresRelacionais2 {
    public static void main(String[] args) {
        /*
        Operadores Relacionais
               == Igual
               != Diferente
               > Maior que
               < Menor que
               >= Maior ou igual a que
               <= Menor ou igual a que
         */


        //Variaveis
        int numero1,numero2;
        numero1 = 12;
        numero2 = 14;


        if (numero1 == numero2) {
            System.out.println("Esse Valor é Igual");
        }

        if (numero1 != numero2) {
            System.out.println("Esses números são Diferente");
        }

        if (numero1 > numero2) {
            System.out.printf("O número %d é maior que o número %d \n", numero1, numero2);
        }

        if (numero1 < numero2) {
            System.out.printf("O número %d é menor que o número %d \n", numero1, numero2);
        }

        if (numero1 >= numero2) {
            System.out.printf("O número %d é maior ou é igual a %d \n", numero1, numero2);
        }

        if (numero1 <= numero2) {
            System.out.printf("O número %d é menor ou é igual a %d \n", numero1, numero2);
        }
    }
}
