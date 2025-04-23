package Condicoes;

public class CondicionalComposta {
    public static void main(String[] args) {

        //Variavel
        int idade = 69;


        //Estrutura de Condição Composta (pois existe condições dentro de condições)
        if (idade >= 18) {
            if (idade >= 62) {
                System.out.println("Você ja é aposentado!");
            } else {
                System.out.println("Você ja é adulto!");
            }
        } else {
            if (idade >= 12) {
                System.out.println("Você é um Adolescente!");
            } else if (idade >= 5) {
                System.out.println("Você é uma criança");
            } else {
                System.out.println("Você é um Bebê");
            }
        }

    }
}
