
package Facade.Exemplo1;


public class CDPlayer {
    private Amplificador amplificador;
    
    public void ligar(){
        System.out.println("CD player Ligado");
    }
    public void desligar(){
        System.out.println("CD player Desligado");
    }
    public void ejetar(){
        System.out.println("Ejetando");
    }
    public void pausar(){
        System.out.println("Cd player pausado");
    }
    public void play(){
        System.out.println("CD player tocando");
    }
    public void stop(){
        System.out.println("STOP CD player");
    }
    
}
