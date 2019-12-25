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

        return true;
    }
    
    //** Método para receber avaliação 
    
    public boolean ReceberAvaliacao(Avaliacao a){
        
        //**Checa para atestar que a avaliação não existe
        if(avaliacoes.contains(a))
            return false;
        
        //**Se a avaliação não existir adiciona-a à lista de avaliações
        avaliacoes.add(a);
        return true;
    }
    
}
