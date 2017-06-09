package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class Som {
    private String local;
    public Som(String local){
        this.local = local;
    }
    public String toString (){
        return local;
    }
    public void ligar(){
        System.out.println(local+" SOM LIGADO");
    }
    public void Desligar(){
        System.out.println(local+" SOM DESLIGADO");
    }
    public void setCD(){
        System.out.println("MODO CD");
    }
    public void setDVD(){
        System.out.println("MODO DVD");
    }
    public void setRadio(){
        System.out.println("MODO RÁDIO");
    }
    public void volume(int v){
        System.out.println("VOLUME: "+v);
    }
    
}
