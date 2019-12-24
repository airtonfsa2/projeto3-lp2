/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Usuário
 */
public abstract class PontoTuristico implements Comparable<PontoTuristico>{
    public String nome;
    public int ordem;
    public String localizacao;
    public String bairro;
    public float pontuacao;
    
    public Cidade cidade;
    public ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public PontoTuristico(String nome, int ordem, String localizacao, String bairro, Cidade cidade) {
        this.nome = nome;
        this.ordem = ordem;
        this.localizacao = localizacao;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        final PontoTuristico other = (PontoTuristico) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
 /*       if (!Objects.equals(this.localizacao, other.localizacao)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }*/
        return true;
    }
    
    public boolean ReceberAvaliacao(Avaliacao a){
        
        if(avaliacoes.contains(a))
            return false;
        
        avaliacoes.add(a);
        return true;
    }
    
}
