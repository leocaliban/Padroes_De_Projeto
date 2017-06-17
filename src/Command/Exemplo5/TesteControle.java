package Command.Exemplo5;

/**
 *
 * @author Leocaliban
 */
public class TesteControle {
    public static void main (String[]args){
        //criar o controle remoto
        ControleRemotoComRefazer controle = new ControleRemotoComRefazer();
        //criar os dispositivos que serão controlados
        Luz luzCozinha = new Luz("Luz Da Cozinha");
        Luz luzSala = new Luz ("Luz Da Sala");
        //criar comandos on e off para cada objeto e colocar os objetos em seus comandos
        ComandoLigarLuz comandoLuzCozinhaOn = new ComandoLigarLuz(luzCozinha);
        ComandoDesligarLuz comandoLuzCozinhaOff = new ComandoDesligarLuz(luzCozinha);
        
        ComandoLigarLuz comandoLuzSalaOn = new ComandoLigarLuz(luzSala);
        ComandoDesligarLuz comandoLuzSalaOff = new ComandoDesligarLuz(luzSala);
        
        //colocar os comandos nos slots do controle
        //cada slot pertence a um objeto, e cada slot possui dois botões On e Off
        controle.setCommand(0, comandoLuzCozinhaOn, comandoLuzCozinhaOff);
        controle.setCommand(1, comandoLuzSalaOn, comandoLuzSalaOff);

        //aqui imprime a estrutura do controle
        System.out.println(controle);
        
        //agora o teste pressionando os botões de cada slot e o de refazer
        controle.botaoOnPressionado(0);
        controle.botaoOffPressionado(0);
        System.out.println(controle);
        controle.botaoRefazerPressionado();
        controle.botaoOffPressionado(0);
        controle.botaoOnPressionado(0);
        System.out.println(controle);
        controle.botaoRefazerPressionado();
        
    }
}
