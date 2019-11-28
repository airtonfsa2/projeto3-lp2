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
public class AvaliacaoTeatro extends Avaliacao {
    public int conforto;
    public int qualidade;
    public int organizacao;

    /*public AvaliacaoTeatro(int conforto, int qualidade, int organizacao) {
        this.conforto = conforto;
        this.qualidade = qualidade;
        this.organizacao = organizacao;
    }
    */

    public AvaliacaoTeatro(String titulo, String descricao, Data data, int pontuacao) {
        super(titulo, descricao, data, pontuacao);
    }
    
}
