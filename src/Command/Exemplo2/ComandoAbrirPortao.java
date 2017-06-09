package Command.Exemplo2;

/**
 * classe que vai executar o comando de abrir o portão 
 * @author Leocaliban
 */
public class ComandoAbrirPortao implements Command{
    private PortaoDaGaragem portao;

    /**
     * construtor que recebe o objeto especifico para ser manipulado
     * @param portao tipo PortaoDaGaragem
     */
    public ComandoAbrirPortao(PortaoDaGaragem portao){
        this.portao = portao;
    }
    @Override
    /**
     * executa a acção no portao, subir o portao
     */
    public void execute() {
        portao.subir();
    }   
}
