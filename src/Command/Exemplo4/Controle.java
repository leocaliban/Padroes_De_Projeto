package Command.Exemplo4;
/**
 * Controle é o objeto que vai enviar o sinal de execução
 * para que um objeto seja acessado através de um comando
 * @author Leocaliban
 */
public class Controle {
    private Command botao;
    private Command botaoRefazer;
    private Command noCommand;
    
    public Controle() {
        noCommand = new NoCommand();
        botaoRefazer = noCommand;
    }
    
    /**
     * define o comando que o botão irá controlar
     * pode ser chamado mais vezes para mudar o comportamento do botao
     * @param botao tipo Command
     */
    public void setComando(Command botao){
        this.botao=botao;
    }
    
    /**
     * realiza a ação quando o botão é pressionado
     * encapsulamento de método.
     */
    public void botaoPressionado(){
        botao.execute();
        botaoRefazer = botao;
    }
    
    public void botaoRefazerPressionado(){
        botaoRefazer.refazer();
    }
    
}
