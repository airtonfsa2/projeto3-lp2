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
public class Cidade {
    public String nome;
    //public Coordenadas localizacao;
    public String estado;
    public String pais;

    public Cidade(String nome, String estado, String pais) {
        this.nome = nome;
        this.estado = estado;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    


    
}
