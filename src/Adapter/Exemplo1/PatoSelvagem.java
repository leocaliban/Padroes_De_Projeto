/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter.Exemplo1;

/**
 *PatoSelvagem é um tipo de pato
 * logo é implementado pela interface Pato
 * o Pato selvagem tem duas funções por ser um tipo de Pato
 * e que são distindas de novos patos que possam vir a ser criados
 * 
 * @author Leocaliban
 */
public class PatoSelvagem implements Pato{

    @Override
    public void comunicarQuack() {
        System.out.println("QUACK SELVAGEM!!!!!");
    }

    @Override
    public void voar() {
        System.out.println("VOANDO... (Alcance Do Vôo: 8m)");
    }
    
}
