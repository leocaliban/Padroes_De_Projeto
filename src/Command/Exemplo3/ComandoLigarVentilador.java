/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Exemplo3;

/**
 *
 * @author Leocaliban
 */
public class ComandoLigarVentilador implements Command {
    private Ventilador ventilador;
    public ComandoLigarVentilador(Ventilador ventilador){
        this.ventilador = ventilador;
    }

    @Override
    public void execute() {
        ventilador.ligar();
    } 
}