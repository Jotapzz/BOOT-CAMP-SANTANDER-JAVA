package TryCatch.ExcecoesCustomizada;

public class Principal {
    public static void main(String[] args) throws cepInvalidoException {

        try {
            String cep = formatarCep("53160181");
            System.out.println(cep);
        } catch (cepInvalidoException e) {
            System.out.println("Cep invalido");
        }



    }

    //Cria uma classe que formatar o cep e utiliza o tratamento que criamos
    static String formatarCep (String cep) throws cepInvalidoException {
        if (cep.length() != 8) {
            throw new cepInvalidoException(); //dispara a exceção
        }

        return cep; // Caso não ele retorna o cep
    }
}


