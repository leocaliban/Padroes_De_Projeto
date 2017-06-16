package Command.Exemplo3;
/**
 *  Comando para desligar o alarme
 * @author Leocaliban
 */
public class ComandoDesligarAlarme implements Command {
    
    private Alarme alarme;
    /**
     * 
     * @param alarme Alarme que será controlado
     */
    public ComandoDesligarAlarme(Alarme alarme){
        this.alarme = alarme;
    }
        
    @Override
    /**
     * executa a ação chamando o método de alarme através do método execute
     */
    public void execute() {
        alarme.desligar();
    } 
}