
package Command.Exemplo3;

/**
 *  Comando para ligar o alarme
 * @author Leocaliban
 */
public class ComandoLigarAlarme implements Command {
    
    private Alarme alarme;
    /**
     * 
     * @param alarme Alarme que ser� controlado
     */
    public ComandoLigarAlarme(Alarme alarme){
        this.alarme = alarme;
    }
        
    @Override
    /**
     * executa a a��o chamando o m�todo de alarme atrav�s do m�todo execute
     */
    public void execute() {
        alarme.ligar();
    } 
}
