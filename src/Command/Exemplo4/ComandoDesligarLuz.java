package Command.Exemplo4;
/**
 * Essa classe implementa Command para que possa dar o comando
 * de apagar a luz em seu método execute()
 * Também faz composição com Luz para que no chamado do método execute()
 * o comando possa acessar luz e seu método desligar(). 
 * @author Leocaliban
 */
public class ComandoDesligarLuz implements Command{
    private Luz luz;

    /**
     * Construtor do ComandoDesligarLuz
     * @param luz tipo Luz específica que irá ser acessada
     */
    public ComandoDesligarLuz(Luz luz){
        this.luz = luz;
    }
    
    @Override
    /**
     * Executa a ação de desligar a luz 
     * através de seu acesso ao Objeto Luz chama o método desligar().
     */
    public void execute() {
        this.luz.desligar();
    } 

    @Override
    /**
     * refaz a ultima ação
     */
    public void refazer() {
        this.luz.ligar();
    }
}
