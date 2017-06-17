/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Exemplo6;

/**
 *
 * @author Leocaliban
 */
public class ComandoVelOff implements Command{
    private VentiladorDeTeto ventilador;
    private int velocidadeAnterior;

    public ComandoVelOff(VentiladorDeTeto v){
        this.ventilador = v;
    }
    
    /**
     * primeiro registra a velocidade anterior e depois executa o comando
     */
    @Override
    public void execute() {
        velocidadeAnterior = ventilador.getVelocidade();
        ventilador.off();
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