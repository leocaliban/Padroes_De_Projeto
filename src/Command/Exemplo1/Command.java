
package Command.Exemplo1;
/**
 *Interface Command será implementado em todas as classes que irão dar comando
 * aos seus objetos
 * @author Leocaliban
 */
public interface Command {
    /**
     * Chamado para executar a ação no objeto através do comando
     */
    public void execute();
}
