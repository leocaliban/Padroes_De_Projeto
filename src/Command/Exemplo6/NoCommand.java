package Command.Exemplo6;

import Command.Exemplo5.*;

/** COM REFAZER
 *  Usado para preencher os slots que n�o ser�o usados no controle remoto
 * os slots sem comando tiram a responsabilidade do cliente lidar com respostas null
 * isso evita verifica��o na hora de popular os slots do controle
 * e n�o fazem nada at� que seja atribuido um objeto em seu slot
 * @author Leocaliban
 */
public class NoCommand implements Command {

    /**
     * n�o faz nada
     */
    @Override
    public void execute() {
    }

    /**
     * n�o faz nada
     */
    @Override
    public void refazer() {
    }   
}
