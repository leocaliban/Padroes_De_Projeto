
package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class Ventilador {
    private String local;
    public Ventilador (String local){
        this.local = local;
    }
    public void ligar(){
        System.out.println(local+": VENTILADOR LIGADO");
    }
    public void desligar(){
        System.out.println(local+": VENTILADOR DESLIGADO");
    }
}
