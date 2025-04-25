package DesafioBasico;

public class SistemaSeletivo {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA SELETIVO ===");
        procesorSeletivo(1800);
    }


    static void procesorSeletivo (double valorCandidato) {
        double salarioBase = 2000;
        if (salarioBase > valorCandidato) {
            System.out.println("Ligar para Candidato");
        } else if (salarioBase == salarioBase) {
            System.out.println("Aguardando demais candidato");
        } else {
            System.out.println("Aguardando o demais candidato");
        }

    }
}
