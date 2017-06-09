package Command.Exemplo3;
/**
 * Objeto Luz
 * @author Leocaliban
 */

public class Luz {
    private String local;
    public Luz(String local){
        this.local = local;
    }
    public String toString (){
        return local;
    }
    
    /**
     * Liga a luz
     */
    public void ligar(){
        System.out.println(this.local+" LUZ LIGADA");
    }
    /**
     * Desliga A Luz
     */
    public void desligar(){
        System.out.println(this.local+" LUZ DESLIGADA");
    }  
}
