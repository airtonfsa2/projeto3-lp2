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
public abstract class PontoTuristico {
    public String nome;
    public int ordem;
    public String bairro;

    public PontoTuristico(String nome, int ordem, String bairro) {
        this.nome = nome;
        this.ordem = ordem;
        this.bairro = bairro;
    }
    
}
