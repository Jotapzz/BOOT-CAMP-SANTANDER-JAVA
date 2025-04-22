package Anatomia;

public class Anatomia4 {
    public static void main(String[] args) {
        int mediaFinal = 6;

        // Com identação
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado");


        // Sem indentação
        if (mediaFinal < 6)
        System.out.println("Reprovado");
        else if (mediaFinal == 6)
        System.out.println("Prova Minerva");
        else
        System.out.println("Aprovado");
    }
}
