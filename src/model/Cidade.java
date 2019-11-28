/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author airto
 */
public class Cidade {
    public String nome;
    public Coordenadas localizacao;
    public String estado;
    public String pais;
    
    List <PontoTuristico> ponto = new ArrayList<>();

    public Cidade(String nome, Coordenadas localizacao, String estado, String pais) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.estado = estado;
        this.pais = pais;
    }
    
    
}
