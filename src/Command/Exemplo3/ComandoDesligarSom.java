package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class ComandoDesligarSom implements Command {
    private Som som;
    
    public ComandoDesligarSom(Som som){
        this.som = som;
    }

    @Override
    public void execute() {
        som.Desligar();  
    }  
}
