
package Facade.Exemplo1;


public class DVDPlayer {
    private Amplificador amplificador;
    
    public void ligar(){
        System.out.println("DVD player Ligado");
    }
    public void desligar(){
        System.out.println("DVD player Desligado");
    }
    public void ejetar(){
        System.out.println("Ejetando");
    }
    public void pausar(){
        System.out.println("DVD player pausado");
    }
    public void play(){
        System.out.println("DVD player tocando");
    }
    public void stop(){
        System.out.println("STOP DVD player");
    }
    public void audioSurround(){
        System.out.println("Surround Ligado");
    }
    public void setAudioDoisCanais(){
        System.out.println("Dois Canais Ligado");
    }
}
