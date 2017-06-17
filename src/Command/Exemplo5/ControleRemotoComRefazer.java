package Command.Exemplo5;

/** COM BOTÃO REFAZER
 * Esse é um controle remoto que tem 7 botões com comandos on e off para cada
 * aparelho conectado a esse controle para que recebam os comandos do controle
 * @author Leocaliban
 */
public class ControleRemotoComRefazer {
    private Command[] on;
    private Command[] off;
    private Command botaoRefazer;
    
    /**
     * instancia as matrizes que são os botões on e off
     * 3 como parametro de entrada para o
     * controle ter quantos slots for preciso
     */
    public ControleRemotoComRefazer(){
        on = new Command[3];
        off = new Command[3];
        //Polimorfismo para criar NoCommands
        //preenchemos os slots do controle com comandos para que nao fiquem
        //null, sendo assim estão esperando só algum objeto para ocupar o slot
        Command noCommand = new NoCommand();
        for (int i = 0;i<3;i++){
            on[i] = noCommand;
            off[i] = noCommand;
        }
        //refazer tambem recebe noCommand, é um slot vazio até que alguém aperte algum botão de ação dos objetos
        botaoRefazer = noCommand;
    }
    
    /**
     * define o comando nas matrizes 
     * @param slot int é o aparelho que irá receber as ações dos botoes on e off 
     * EX: slot = TV; botao on & botao off
     * @param on Comando on
     * @param off Comando off
     */
    public void setCommand(int slot, Command on, Command off){
        this.on[slot] = on;
        this.off[slot] = off;
    }
    
    /**
     * quando o botão On é precionado ele realiza a ação chamando o método execute do comando que acessa o receptor
     * o botão refazer recebe o botão que foi pressionado para quando refazer for pressionado
     * ele realize a acção contraria do botao anterior
     * @param slot int slot que se encontra o botão precionado
     */
    public void botaoOnPressionado(int slot){
        this.on[slot].execute();
        botaoRefazer = on[slot];
    }
    
    /**
     * quando o botão Off é pressionado ele realiza a ação chamando o método execute do comando que acessa o receptor
     * o botão refazer recebe o botão que foi pressionado para quando refazer for pressionado
     * ele realize a acção contraria do botao anterior
     * @param slot int slot que se encontra o botão precionado
     */
    public void botaoOffPressionado(int slot){
        this.off[slot].execute();
        botaoRefazer = off[slot];
    }
    
    /**
     * refaz ação do botão pressionado anteriormente
     */
    public void botaoRefazerPressionado(){
        botaoRefazer.refazer();
    }
    
    /**
     * para poder ver a construção do controle, seus slots e botões
     * @return os dados do controle pronto
     */
    public String toString(){
        //StringBuffer é Mutável e é usado para concatenar Strings através de seu método .append()
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n---------- Controle Remoto ----------\n");
        for (int i = 0; i<on.length;i++){
            stringBuff.append("[Slot "+i+"] "+on[i].getClass().getName()+"  |  "+off[i].getClass().getName()+" \n");
        }
        //colocando o botão refazer também
        stringBuff.append("[REFAZER] "+botaoRefazer.getClass().getName()+"\n");
        return stringBuff.toString();
    }
}
