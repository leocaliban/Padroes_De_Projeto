package Command.Exemplo4;

/**
 * Classe que representa o Cliente para esse padr�o 
 * cont�m o main
 * @author Leocaliban
 */
public class TesteControle {
    public static void main(String []args){
        //Controle � o invocador
        Controle controle = new Controle();
        //Luz � o receptor
        Luz luz = new Luz();
        
        //adicionando a luz ao comando ligar luz
        ComandoLigarLuz comandoLigar = new ComandoLigarLuz(luz);
        
        ComandoDesligarLuz comandoDesligar = new ComandoDesligarLuz(luz);
        
        //adicionando o comando ligar luz no controle
        controle.setComando(comandoLigar);
        //apertando o botao do controle
        controle.botaoPressionado();
        
        controle.botaoRefazerPressionado();
        
        controle.setComando(comandoDesligar);
        controle.botaoPressionado();
        
        controle.botaoRefazerPressionado();
    }
}
