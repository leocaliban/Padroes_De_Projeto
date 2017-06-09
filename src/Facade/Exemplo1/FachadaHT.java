/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.Exemplo1;

/**
 *
 * @author Leocaliban
 */

public class FachadaHT {
    Amplificador amplificador;
    CDPlayer CDPlayer;
    DVDPlayer DVDPlayer;
    LuzAmbiente LuzAmbiente;
    MaquinaPipoca MaquinaPipoca;
    Projetor Projetor;
    Sintonizador Sintonizador;
    Tela Tela;
    
    public FachadaHT(Amplificador amplificador,
    CDPlayer CDPlayer,
    DVDPlayer DVDPlayer,
    LuzAmbiente LuzAmbiente,
    MaquinaPipoca MaquinaPipoca,
    Projetor Projetor,
    Sintonizador Sintonizador,
    Tela Tela){
        this.amplificador =amplificador;
        this.CDPlayer  =CDPlayer;
        this.DVDPlayer =DVDPlayer;
        this.LuzAmbiente= LuzAmbiente;
        this.MaquinaPipoca= MaquinaPipoca;
        this.Projetor= Projetor;
        this.Sintonizador =Sintonizador;
        this.Tela =Tela;
        
    }
}

