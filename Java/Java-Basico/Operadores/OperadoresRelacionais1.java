package Operadores;

public class OperadoresRelacionais1 {
    public static void main(String[] args) {
        //Criando Variavel e seu Tipo
        int numero1, numero2;

        //Atribuindo Valor a Variavel
        numero1 = 10;
        numero2 = 13;

        String resultado;


        //Condição Ternaria (Utiliza-se quando tem apenas um if e um else)
        resultado = numero1 == numero2 ? "Verdadeiro" : "Falso";

        //Condição Normal
        if (numero1 == numero2) {
            resultado = "Verdadeiro";
        }
        else {
            resultado = "Falso";
        }

        System.out.println(resultado);
    }
}
