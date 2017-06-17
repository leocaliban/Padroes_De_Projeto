package Command.Exemplo6;
/**
 *
 * @author Leocaliban
 */
public class TesteControle {
    public static void main (String[]args){
        //criar o controle remoto
        ControleRemotoComRefazer controle = new ControleRemotoComRefazer();
        //criar os dispositivos que serão controlados
        VentiladorDeTeto ventilador = new VentiladorDeTeto("Ventilador Da Sala");

        //criar comandos on e off para cada objeto e colocar os objetos em seus comandos
        ComandoVelAlta alta = new ComandoVelAlta(ventilador);
        ComandoVelBaixa baixa = new ComandoVelBaixa(ventilador);
        ComandoVelMedia media = new ComandoVelMedia(ventilador);
        ComandoVelOff off = new ComandoVelOff(ventilador);
        
        //colocar os comandos nos slots do controle
        //cada slot pertence a um objeto, e cada slot possui dois botões On e Off
        controle.setCommand(0, alta, off);
        controle.setCommand(1, media, off);
        controle.setCommand(2, baixa, off);

        //aqui imprime a estrutura do controle
        System.out.println(controle);
        
        //agora o teste pressionando os botões de cada slot e o de refazer
        controle.botaoOnPressionado(0);
        controle.botaoOffPressionado(0);
        System.out.println(controle);
        controle.botaoRefazerPressionado();
        
        controle.botaoOnPressionado(1);
        System.out.println(controle);
        controle.botaoRefazerPressionado();
        controle.botaoOnPressionado(2);
        controle.botaoOffPressionado(0);
        
        
    }
}
