/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Usuário
 */
public class AvaliacaoTeatro extends Avaliacao{
    
    public int conforto;
    public int qualidade;
    public int organizacao;

    public AvaliacaoTeatro(String titulo, String descricao, Calendar data, int conforto, int qualidade, int organizacao) {
        super(titulo, descricao, data);
        this.conforto = conforto;
        this.qualidade = qualidade;
        this.organizacao = organizacao;
    }
    
    /*
        Uso da interface 'Comparable' para facilitar na hora da ordenação
    */
    @Override
    public int compareTo(Avaliacao o) {
        return this.data.compareTo(o.data);
    }

    @Override
    public float getPontuacao() {
        return ((conforto + qualidade + organizacao) / 3);
    }
    
    
    
}
