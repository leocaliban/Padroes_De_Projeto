package Command.Exemplo2;

/**
 * classe que vai executar o comando de ligar a luz
 * @author Leocaliban
 */
public class ComandoLigarLuz implements Command {
    private PortaoDaGaragem portao;
    
    /**
     * construtor que recebe o objeto especifico para ser manipulado
     * @param portao tipo PortaoDaGaragem que possui o m�dodo acender a luz
     */
    public ComandoLigarLuz(PortaoDaGaragem portao){
        this.portao = portao;
    }
    
    /**
     * encapsula e chama o m�todo de acenderLuz do PortaoDaGaragem
     */
    @Override
    public void execute() {
        this.portao.acenderLuz();
    }  
}
