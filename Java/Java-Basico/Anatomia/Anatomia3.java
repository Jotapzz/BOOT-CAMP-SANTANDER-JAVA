package Anatomia;

public class Anatomia3 {
    public static void main(String[] args) {
        /*
        Como Descobrir oque é Variavel e Metodo
         */

        /*variavel
         Tipo nomedaVariavel = valor da atribuição (opicional); */
        String nomeUsuario = "Pedro";




        //Variaveis para o Parâmetro da Função
        String nome = "João";
        String sobrenome = "Pedro";

        //Utilizando o Metodo e atribuindo na Variavel
        String nomeCompleto = nomeCompleto(nome, sobrenome);


        //Imprimindo
        System.out.println(nomeCompleto);

    }

    //Metodo
    //Visibilidade ..... tipo NomeDoMetodo (parâmetro)

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
