
package Command.Exemplo3;

/**
 * Esse � um controle remoto que tem 7 bot�es com comandos on e off para cada
 * aparelho conectado a esse controle para que recebam os comandos do controle
 * @author Leocaliban
 */
public class ControleRemoto {
    private Command[] on;
    private Command[] off;
    
    /**
     * instancia as matrizes que s�o os bot�es on e off
     */
    public ControleRemoto(){
        on = new Command[7];
        off = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0;i<7;i++){
            on[i] = noCommand;
            off[i] = noCommand;
        }
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
     * @param slot int slot que se encontra o bot�o precionado
     */
    public void botaoOnPressionado(int slot){
        this.on[slot].execute();
    }
    
    /**
     * quando o bot�o Off � precionado ele realiza a a��o chamando o m�todo execute do comando que acessa o receptor
     * @param slot int slot que se encontra o bot�o precionado
     */
    public void botaoOffPressionado(int slot){
        this.off[slot].execute();
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
            stringBuff.append("[Slot "+i+"] "+on[i].getClass().getName()+"    "+off[i].getClass().getName()+" \n");
        }
        return stringBuff.toString();
    }
}
