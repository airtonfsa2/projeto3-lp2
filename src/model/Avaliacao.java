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

//** Classe usada para receber a avaliação e processar


public abstract class Avaliacao implements Comparable<Avaliacao>{
    public String titulo;
    public String descricao;
    public Calendar data;
    public float pontuacao;
    public boolean jaAvaliado = false;

    public Avaliacao(String titulo, String descricao, Calendar data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }
    
    public abstract float getPontuacao();
    
}
