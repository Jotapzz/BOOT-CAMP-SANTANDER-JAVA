package TiposPrimitivo;

public class TipoVariavel {
    public static void main(String[] args) {
        double salarioMinimo = 2500.32;

        // O valor que consegue um valor maior não pode ser atribuido em valores menores
        short numeroCurto = 1;
        short numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Para a Variavel não mudar o valor
        //Utilizamos o modificador Final


        final float VALOR_DE_PI = 3.14f; // Essa variavel não vai ter o valor modificado



        //Tipos Primitivos

        //Tipo Inteiro
        byte umNumero;
        short idade;
        int ano;
        long estrelas;

        //Tipo Caractere
        char Caractere;
        String nome; //OBS: String não é um Tipo e Sim uma Classe

        //Tipo Flutuante
        float dinheiro;
        double salario;

        //Tipo logico
        boolean matricula;
    }
}
