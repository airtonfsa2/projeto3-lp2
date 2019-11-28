/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author airto
 */
public class Hotel extends PontoTuristico {
    public int estrelas;
    public enum preco{caro, razoavel, bom};
    public boolean ar;
    public boolean cafeDaManha;

    public Hotel(int estrelas, boolean ar, boolean cafeDaManha) {
        this.estrelas = estrelas;
        this.ar = ar;
        this.cafeDaManha = cafeDaManha;
    }
    
}
