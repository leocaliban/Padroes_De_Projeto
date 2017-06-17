package Command.Exemplo6;

import Command.Exemplo5.*;

/**COM REFAZER()
 * Interface Command ser� implementado em todas as classes que ir�o dar comando
 * aos seus objetos
 * @author Leocaliban
 */
public interface Command {
    /**
     * Chamado para executar a a��o no objeto atrav�s do comando
     */
    public void execute();
    /**
     * Refaz a �ltima a��o
     */
    public void refazer();
}
