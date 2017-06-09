package Command.Exemplo1;

/**
 * Controle é o objeto que vai enviar o sinal de execução
 * para que um objeto seja acessado através de um comando
 * @author Leocaliban
 */
public class Controle {
    private Command botao;
    
    public Controle() {
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
     */
    public void botaoPressionado(){
        botao.execute();
    }
}
