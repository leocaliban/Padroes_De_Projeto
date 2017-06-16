package Command.Exemplo4;
/**
 * Controle � o objeto que vai enviar o sinal de execu��o
 * para que um objeto seja acessado atrav�s de um comando
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
     * define o comando que o bot�o ir� controlar
     * pode ser chamado mais vezes para mudar o comportamento do botao
     * @param botao tipo Command
     */
    public void setComando(Command botao){
        this.botao=botao;
    }
    
    /**
     * realiza a a��o quando o bot�o � pressionado
     * encapsulamento de m�todo.
     */
    public void botaoPressionado(){
        botao.execute();
        botaoRefazer = botao;
    }
    
    public void botaoRefazerPressionado(){
        botaoRefazer.refazer();
    }
    
}
