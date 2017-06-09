
package Facade.Exemplo1;


public class Projetor {
    private DVDPlayer dvd;
    
    public void ligar(){
        System.out.println("Projetor Ligado");
    }
    public void deslçigar(){
        System.out.println("Projetor Desligado");
    }
    public void tvMode(){
        System.out.println("Modo TV Ligado");
    }
    public void wideScreen(){
        System.out.println("WideScreen Ativado");
    }
}
