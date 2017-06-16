package Command.Exemplo4;
/**
 * Essa classe implementa Command para que possa dar o comando
 * de apagar a luz em seu m�todo execute()
 * Tamb�m faz composi��o com Luz para que no chamado do m�todo execute()
 * o comando possa acessar luz e seu m�todo desligar(). 
 * @author Leocaliban
 */
public class ComandoDesligarLuz implements Command{
    private Luz luz;

    /**
     * Construtor do ComandoDesligarLuz
     * @param luz tipo Luz espec�fica que ir� ser acessada
     */
    public ComandoDesligarLuz(Luz luz){
        this.luz = luz;
    }
    
    @Override
    /**
     * Executa a a��o de desligar a luz 
     * atrav�s de seu acesso ao Objeto Luz chama o m�todo desligar().
     */
    public void execute() {
        this.luz.desligar();
    } 

    @Override
    /**
     * refaz a ultima a��o
     */
    public void refazer() {
        this.luz.ligar();
    }
}
