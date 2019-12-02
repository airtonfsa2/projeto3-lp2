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
public class Teatro extends PontoTuristico {
    public boolean internacional;
    public boolean publico;

    public Teatro(String nome, int ordem, String bairro, boolean internacional, boolean publico) {
        super(nome, ordem, bairro);
        this.internacional = internacional;
        this.publico = publico;
    }
    
    
}
