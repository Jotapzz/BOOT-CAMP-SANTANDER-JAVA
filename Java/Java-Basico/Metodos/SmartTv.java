package Metodos;

public class SmartTv {
    //Atributos
    private boolean ligado;
    private int canal;
    private int volume;

    //Metodo construtor
    public SmartTv () {
        setLigado(false);
        setCanal(0);
        setVolume(0);

    }


    //Metodo de ligar tv
    public void ligar () {
        if (!ligado) {
            System.out.println("A tv foi ligada!");
            setLigado(true);
        }


    }

    //Metodo de desligar a tv
    public void desligar () {
        if (ligado) {
            System.out.println("A tv foi desligada!");
            setLigado(false);
        }
    }

    //metodo de aumentar volume
    public void aumentarVolume () {
        if (getVolume() < 50) {
            setVolume(getVolume() + 1);
        }
    }

    //metodo de dominuir volume da tv
    public void diminuirVolume () {
        if (getVolume() > 0) {
            setVolume(getVolume() + 1);
        }
    }

    //metodo de mudar o canal da tv
    public void mudarCanal () {
        setCanal(getVolume() + 1);
    }

    //Metodo de mudar o canal pelo valor digitado
    public void mudarCanal (int canal) {
        if (canal < 0) {
            System.out.println("Digite um canal Correto");
        }
        else {
            setCanal(canal);
        }

    }



    //Metodos Gets e Sets
    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "ligado=" + ligado +
                ", canal=" + canal +
                ", volume=" + volume +
                '}';
    }

    //Metodo Principal
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        tv.ligar();
        tv.mudarCanal(2);
        System.out.println(tv.toString());
    }
}


