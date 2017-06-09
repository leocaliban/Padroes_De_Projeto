package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class ComandoLigarSomETocarCD implements Command {
    private Som som;
    
    public ComandoLigarSomETocarCD (Som som){
        this.som = som;
    }
    @Override
    public void execute() {
        som.ligar();
        som.setCD();
        som.volume(11);
    }
    
}
