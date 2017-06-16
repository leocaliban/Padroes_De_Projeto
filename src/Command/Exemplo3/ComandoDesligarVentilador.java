
package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class ComandoDesligarVentilador implements Command {
    private Ventilador ventilador;
    public ComandoDesligarVentilador(Ventilador ventilador){
        this.ventilador = ventilador;
    }

    @Override
    public void execute() {
        ventilador.desligar();
    } 
}
