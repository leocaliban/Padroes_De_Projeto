
package Command.Exemplo1;

/**
 *
 * @author Leocaliban
 */
public class ComandoLigarLuz implements Command{
    private Luz luz;

    public ComandoLigarLuz(Luz luz){
        this.luz = luz;
    }
    
    
    
    @Override
    public void execute() {
    this.luz.ligar();
    } 
}
