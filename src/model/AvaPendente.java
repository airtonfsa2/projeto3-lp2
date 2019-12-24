/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuário
 */
public class AvaPendente {
    
    private PontoTuristico p;
    private Avaliacao a;

    public PontoTuristico getP() {
        return p;
    }

    public Avaliacao getA() {
        return a;
    }

    public AvaPendente(PontoTuristico p, Avaliacao a) {
        this.p = p;
        this.a = a;
    }
    
    public void AprovarAv(){
        a.jaAvaliado = true;
    }
    
    public void DesaprovarAv(){
        p.avaliacoes.remove(a);
    }
    
}
