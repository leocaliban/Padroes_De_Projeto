package Command.Exemplo4;

/**
 * Classe que representa o Cliente para esse padrão 
 * Aqui testaremos o botão refazer
 * @author Leocaliban
 */
public class TesteControle {
    public static void main(String []args){
        //Controle é o invocador
        Controle controle = new Controle();
        //Luz é o receptor
        Luz luz = new Luz();
        
        //adicionando a luz ao comando ligar luz
        ComandoLigarLuz comandoLigar = new ComandoLigarLuz(luz);
        //adicionando a luz ao comando desligar luz
        ComandoDesligarLuz comandoDesligar = new ComandoDesligarLuz(luz);
        
        //adicionando o comando ligar luz no controle
        controle.setComando(comandoLigar);
        //apertando o botao do controle
        controle.botaoPressionado();
        //apertando o botao refazer
        controle.botaoRefazerPressionado();
        System.out.println("FIM DO TESTE 1");
        // vamos ligar, desligar e refazer o desligar.
        controle.setComando(comandoLigar);
        controle.botaoPressionado();
        controle.setComando(comandoDesligar);
        controle.botaoPressionado();
        controle.botaoRefazerPressionado();
    }
}
