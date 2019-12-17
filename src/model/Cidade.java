/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author airto
 */
public class Cidade implements Comparable<Cidade> {
    public String nome;
    public String cep;
    public String estado;
    public String pais;

    public Cidade(String nome, String estado, String pais, String cep) {
        this.nome = nome;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
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
    
    public String getCep(){
        return cep;
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
    
    public void setCep(String cep){
        this.cep = cep;
    }

    @Override
    public int compareTo(Cidade o) {
        return this.getNome().compareTo(o.getNome());
    }
    
    @Override
    public String toString(){
        return "Nome da cidade: " +nome + ", estado: " + estado + "pais: " + pais;
    }
    


    
}
