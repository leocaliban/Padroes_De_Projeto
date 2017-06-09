
package Command.Exemplo3;

/**
 * Esse é um controle remoto que tem 7 botões com comandos on e off para cada
 * aparelho conectado a esse controle para que recebam os comandos do controle
 * @author Leocaliban
 */
public class ControleRemoto {
    private Command[] on;
    private Command[] off;
    
    /**
     * instancia as matrizes que são os botões on e off
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
     * @param slot int slot que se encontra o botão precionado
     */
    public void botaoOnPressionado(int slot){
        this.on[slot].execute();
    }
    
    /**
     * quando o botão Off é precionado ele realiza a ação chamando o método execute do comando que acessa o receptor
     * @param slot int slot que se encontra o botão precionado
     */
    public void botaoOffPressionado(int slot){
        this.off[slot].execute();
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
            stringBuff.append("[Slot "+i+"] "+on[i].getClass().getName()+"    "+off[i].getClass().getName()+" \n");
        }
        return stringBuff.toString();
    }
}
