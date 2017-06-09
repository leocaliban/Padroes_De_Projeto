package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class TesteControle {
    public static void main (String[]args){
        ControleRemoto controle = new ControleRemoto();
        Luz luzCozinha = new Luz("Luz Da Cozinha");
        Som somSala = new Som("Som Da Sala");
        
        ComandoLigarLuz comandoLigarLuz = new ComandoLigarLuz(luzCozinha);
        ComandoDesligarLuz comandoDesligarLuz = new ComandoDesligarLuz(luzCozinha);
        
        ComandoLigarSomETocarCD comandoLigarSom = new ComandoLigarSomETocarCD(somSala);
        ComandoDesligarSom comandoDesligarSom = new ComandoDesligarSom(somSala);
        
        controle.setCommand(0, comandoLigarLuz, comandoDesligarLuz);
        controle.setCommand(1, comandoLigarSom, comandoDesligarSom);
        
        System.out.println(controle);
        
        controle.botaoOnPressionado(0);
        controle.botaoOnPressionado(1);
        controle.botaoOffPressionado(0);
    }
}
