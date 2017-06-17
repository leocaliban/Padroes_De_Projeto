package Command.Exemplo6;

/** COM BOT�O REFAZER
 * CONTROLE AGORA ADAPTADO PARA O VENTILADOR ignorar alguns coment�rios
 * @author Leocaliban
 */
public class ControleRemotoComRefazer {
    private Command[] on;
    private Command[] off;
    private Command botaoRefazer;
    
    /**
     * instancia as matrizes que s�o os bot�es on e off
     * 7 como parametro de entrada para o
     * controle ter quantos slots for preciso
     */
    public ControleRemotoComRefazer(){
        on = new Command[7];
        off = new Command[7];
        //Polimorfismo para criar NoCommands
        //preenchemos os slots do controle com comandos para que nao fiquem
        //null, sendo assim est�o esperando s� algum objeto para ocupar o slot
        Command noCommand = new NoCommand();
        for (int i = 0;i<7;i++){
            on[i] = noCommand;
            off[i] = noCommand;
        }
        //refazer tambem recebe noCommand, � um slot vazio at� que algu�m aperte algum bot�o de a��o dos objetos
        botaoRefazer = noCommand;
    }
    
    /**
     * define o comando nas matrizes 
     * @param slot int � o aparelho que ir� receber as a��es dos botoes on e off 
     * EX: slot = TV; botao on & botao off
     * @param on Comando on
     * @param off Comando off
     */
    public void setCommand(int slot, Command on, Command off){
        this.on[slot] = on;
        this.off[slot] = off;
    }
    
    /**
     * quando o bot�o On � precionado ele realiza a a��o chamando o m�todo execute do comando que acessa o receptor
     * o bot�o refazer recebe o bot�o que foi pressionado para quando refazer for pressionado
     * ele realize a ac��o contraria do botao anterior
     * @param slot int slot que se encontra o bot�o precionado
     */
    public void botaoOnPressionado(int slot){
        this.on[slot].execute();
        botaoRefazer = on[slot];
    }
    
    /**
     * quando o bot�o Off � pressionado ele realiza a a��o chamando o m�todo execute do comando que acessa o receptor
     * o bot�o refazer recebe o bot�o que foi pressionado para quando refazer for pressionado
     * ele realize a ac��o contraria do botao anterior
     * @param slot int slot que se encontra o bot�o precionado
     */
    public void botaoOffPressionado(int slot){
        this.off[slot].execute();
        botaoRefazer = off[slot];
    }
    
    /**
     * refaz a��o do bot�o pressionado anteriormente
     */
    public void botaoRefazerPressionado(){
        botaoRefazer.refazer();
    }
    
    /**
     * para poder ver a constru��o do controle, seus slots e bot�es
     * @return os dados do controle pronto
     */
    public String toString(){
        //StringBuffer � Mut�vel e � usado para concatenar Strings atrav�s de seu m�todo .append()
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n---------- Controle Remoto ----------\n");
        for (int i = 0; i<on.length;i++){
            stringBuff.append("[Slot "+i+"] "+on[i].getClass().getName()+"  |  "+off[i].getClass().getName()+" \n");
        }
        //colocando o bot�o refazer tamb�m
        stringBuff.append("[REFAZER] "+botaoRefazer.getClass().getName()+"\n");
        return stringBuff.toString();
    }
}
