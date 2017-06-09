package Command.Exemplo2;

/**
 * classe cliente
 * @author Leocaliban
 */
public class TesteControle {
    public static void main (String[]args){
        //cria o invocador
        Controle controle = new Controle();
        
        //cria o receptor das ações
        PortaoDaGaragem portao = new PortaoDaGaragem();
        
        //comandos que recebem seus receptores
        ComandoAbrirPortao comandoAbrir = new ComandoAbrirPortao(portao);
        ComandoLigarLuz comandoLigar = new ComandoLigarLuz(portao);
        
        //o controle adiciona os comandos e invoca as ações
        controle.setComando(comandoAbrir);
        controle.botaoPressionado();
        controle.setComando(comandoLigar);
        controle.botaoPressionado();
    }
}
