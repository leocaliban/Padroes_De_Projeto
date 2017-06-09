package Command.Exemplo1;
/**
 * Essa classe implementa Command para que possa dar o comando
 * de acender a luz em seu método execute()
 * Também faz composição com Luz para que no chamado do método execute()
 * o comando possa acessar luz e seu método ligar(). 
 * @author Leocaliban
 */
public class ComandoLigarLuz implements Command{
    private Luz luz;

    /**
     * Construtor do ComandoLigarLuz
     * @param luz tipo Luz específica que irá ser acessada
     */
    public ComandoLigarLuz(Luz luz){
        this.luz = luz;
    }
    
    @Override
    /**
     * Executa a ação de ligar a luz 
     * através de seu acesso ao Objeto Luz chama o método ligar().
     */
    public void execute() {
    this.luz.ligar();
    } 
}
