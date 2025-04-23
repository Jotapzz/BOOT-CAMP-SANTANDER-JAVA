package Operadores;

public class OperadoresLogico {
    public static void main(String[] args) {
        /*
        Operadores Lógico
              && Significa E (se 20 > 10 E 20 < 34)
              || Significa OU (se 3 < 2 OU 3 > 3)

         */

        //Variaveis
        boolean condicao1 = true;
        boolean condicao2 = false;


        // se (condicao1 for verdadeiro E condicao2 for verdadeiro)
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeira");
        }

        //se (condicao1 for verdadeiro OU condicao2 for verdadeiro)
        if (condicao1 || condicao2) {
            System.out.println("Apenas uma das condições é verdadeira");
        }
    }
}
