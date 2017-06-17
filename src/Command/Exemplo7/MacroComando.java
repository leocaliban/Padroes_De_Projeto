package Command.Exemplo7;

/**
 *
 * @author Leocaliban
 */
public class MacroComando implements Command{
    private Command [] comandos;
    
    public MacroComando(Command[] comandos){
        this.comandos = comandos;
    }

    @Override
    public void execute() {
        for(int i = 0; i < comandos.length;i++){
            comandos[i].execute();
        }
    }
}
