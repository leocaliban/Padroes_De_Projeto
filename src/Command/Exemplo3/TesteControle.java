package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class TesteControle {
    public static void main (String[]args){
        //criar o controle remoto
        ControleRemoto controle = new ControleRemoto();
        //criar os dispositivos que serão controlados
        Luz luzCozinha = new Luz("Luz Da Cozinha");
        Luz luzSala = new Luz ("Luz Da Sala");
        Alarme alarme = new Alarme();
        Ventilador ventiladorSala = new Ventilador("Ventilador Da Sala");
        Som somSala = new Som("Som Da Sala");
        
        //criar comandos on e off para cada objeto e colocar os objetos em seus comandos
        ComandoLigarLuz comandoLuzCozinhaOn = new ComandoLigarLuz(luzCozinha);
        ComandoDesligarLuz comandoLuzCozinhaOff = new ComandoDesligarLuz(luzCozinha);
        
        ComandoLigarLuz comandoLuzSalaOn = new ComandoLigarLuz(luzSala);
        ComandoDesligarLuz comandoLuzSalaOff = new ComandoDesligarLuz(luzSala);
        
        ComandoLigarAlarme comandoAlarmeOn = new ComandoLigarAlarme(alarme);
        ComandoDesligarAlarme comandoAlarmeOff = new ComandoDesligarAlarme(alarme);
        
        ComandoLigarVentilador comandoVentiladorOn = new ComandoLigarVentilador(ventiladorSala);
        ComandoDesligarVentilador comandoVentiladorOff = new ComandoDesligarVentilador(ventiladorSala);
        
        ComandoLigarSomETocarCD comandoSomOn = new ComandoLigarSomETocarCD(somSala);
        ComandoDesligarSom comandoSomOff = new ComandoDesligarSom(somSala);
        
        /**
         * colocar os comandos nos slots do controle
         * cada slot pertence a um objeto, e cada slot possui dois botões On e Off
         */
        controle.setCommand(0, comandoLuzCozinhaOn, comandoLuzCozinhaOff);
        controle.setCommand(1, comandoLuzSalaOn, comandoLuzSalaOff);
        controle.setCommand(2, comandoAlarmeOn, comandoAlarmeOff);
        controle.setCommand(3, comandoVentiladorOn, comandoVentiladorOff);
        controle.setCommand(4, comandoSomOn, comandoSomOff);
        //aqui imprime a estrutura do controle
        System.out.println(controle);
        
        //agora o teste pressionando os botões de cada slot
        controle.botaoOnPressionado(0);
        controle.botaoOffPressionado(0);
        controle.botaoOnPressionado(1);
        controle.botaoOffPressionado(1);
        controle.botaoOnPressionado(2);
        controle.botaoOffPressionado(2);
        controle.botaoOnPressionado(3);
        controle.botaoOffPressionado(3);
        controle.botaoOnPressionado(4);
        controle.botaoOffPressionado(4);
    }
}
