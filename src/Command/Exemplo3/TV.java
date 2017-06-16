
package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class TV {
    private String local;
    /**
     * 
     * @param local NOME do local da tv
     */
    public TV (String local){
        this.local = local;
    }
    public void ligar(){
        System.out.println(local+": TV LIGADA");
    }
    public void desligar(){
        System.out.println(local+": TV DESLIGADA");
    }
    public void mudarCanal(){
        System.out.println("CANAL MUDADO");
    }
    /**
     * 
     * @param v numero do volume
     */
    public void volume (int v){
        System.out.println("VOLUME: "+v);
    }
}
