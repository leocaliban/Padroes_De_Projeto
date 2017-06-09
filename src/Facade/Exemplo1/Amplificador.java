
package Facade.Exemplo1;


public class Amplificador {
    private Sintonizador sintonizador;
    private CDPlayer cd;
    private DVDPlayer dvd;
    
    public void ligar(){
        System.out.println("Amplificador Ligado");
    }
    public void desligar(){
        System.out.println("Amplificador Desligado");
    }

}

