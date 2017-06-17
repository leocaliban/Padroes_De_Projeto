package Command.Exemplo5;

/** COM REFAZER
 * Essa classe implementa Command para que possa dar o comando
 * de acender a luz em seu m�todo execute()
 * Tamb�m faz composi��o com Luz para que no chamado do m�todo execute()
 * o comando possa acessar luz e seu m�todo ligar(). 
 * @author Leocaliban
 */
public class ComandoLigarLuz implements Command{
    private Luz luz;

    /**
     * Construtor do ComandoLigarLuz
     * @param luz tipo Luz espec�fica que ir� ser acessada
     */
    public ComandoLigarLuz(Luz luz){
        this.luz = luz;
    }
    
    @Override
    /**
     * Executa a a��o de ligar a luz 
     * atrav�s de seu acesso ao Objeto Luz chama o m�todo ligar().
     */
    public void execute() {
        this.luz.ligar();
    } 

    /**
     * Refaz o comando, como esse comando ir� ligar a luz ent�o o refazer ser� desligar
     */
    @Override
    public void refazer() {
        this.luz.desligar();
    }
}
