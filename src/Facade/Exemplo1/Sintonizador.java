package Facade.Exemplo1;

public class Sintonizador {
    private Amplificador amplificador;
    
    public void ligar(){
        System.out.println("Sintonizador Ligado");
    }
    public void desligar (){
        System.out.println("Sintonizador Desligado");
    }
    public void setAM(){
        System.out.println("RADIO AM");
    }
    public void setFM(){
        System.out.println("RADIO FM");
    }
    public void setFrequencia(int i){
        System.out.println(i);
    }
}
