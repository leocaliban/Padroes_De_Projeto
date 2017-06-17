package Command.Exemplo6;

import Command.Exemplo5.*;

/** COM REFAZER
 *  Usado para preencher os slots que não serão usados no controle remoto
 * os slots sem comando tiram a responsabilidade do cliente lidar com respostas null
 * isso evita verificação na hora de popular os slots do controle
 * e não fazem nada até que seja atribuido um objeto em seu slot
 * @author Leocaliban
 */
public class NoCommand implements Command {

    /**
     * não faz nada
     */
    @Override
    public void execute() {
    }

    /**
     * não faz nada
     */
    @Override
    public void refazer() {
    }   
}
