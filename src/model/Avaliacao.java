/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author airto
 */
public class Avaliacao {
    public String titulo;
    public String descricao;
    public Calendar data;
    public int pontuacao;

    public Avaliacao(String titulo, String descricao, Calendar data, int pontuacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.pontuacao = pontuacao;
    }
    
}
