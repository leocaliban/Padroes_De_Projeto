package Command.Exemplo6;

/**
 *
 * @author Leocaliban
 */
public class ComandoVelAlta implements Command{
    private VentiladorDeTeto ventilador;
    private int velocidadeAnterior;

    public ComandoVelAlta(VentiladorDeTeto v){
        this.ventilador = v;
    }
    
    /**
     * primeiro registra a velocidade anterior e depois executa o comando
     */
    @Override
    public void execute() {
        velocidadeAnterior = ventilador.getVelocidade();
        ventilador.alta();
    }

    /**
     * recupera a velocidade anterior e compara antes de executar o comando compátivel
     */
    @Override
    public void refazer() {
        if(velocidadeAnterior == ventilador.ALTA){
            ventilador.alta();
        }
        else if(velocidadeAnterior == ventilador.MEDIA){
            ventilador.media();
        }
        else if(velocidadeAnterior == ventilador.BAIXA){
            ventilador.baixa();
        }
        else if(velocidadeAnterior == ventilador.OFF){
            ventilador.off();
        }
    } 
}
