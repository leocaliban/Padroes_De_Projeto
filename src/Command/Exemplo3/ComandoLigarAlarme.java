
package Command.Exemplo3;

/**
 *  Comando para ligar o alarme
 * @author Leocaliban
 */
public class ComandoLigarAlarme implements Command {
    
    private Alarme alarme;
    /**
     * 
     * @param alarme Alarme que será controlado
     */
    public ComandoLigarAlarme(Alarme alarme){
        this.alarme = alarme;
    }
        
    @Override
    /**
     * executa a ação chamando o método de alarme através do método execute
     */
    public void execute() {
        alarme.ligar();
    } 
}
