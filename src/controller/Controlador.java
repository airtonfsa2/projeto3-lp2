/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Cidade;
import model.Moderador;
import model.PontoTuristico;
import model.Usuario;

/**
 *
 * @author Aluno
 */
public class Controlador {
    
    List<PontoTuristico> listaPontos = new ArrayList<>();
    List<Usuario> listaUsuarios = new ArrayList<>();
    List<Cidade> listaCidades = new ArrayList<>();
    List<Moderador> listaModeradores = new ArrayList<>();
    
    PontoTuristico ponto;
    Usuario usuario;
    Cidade cidade;
    Moderador moderador;
    
    public boolean cadastrarCidade(String nome, String estado, String pais){
        Iterator it = listaCidades.iterator();
        
        cidade = new Cidade (nome, estado, pais);
        
        while(it.hasNext()){
            boolean aux = it.hasNext();
            if(cidade.equals(aux)){
                return false;
            }
        }
        listaCidades.add(cidade);{
        return true;
    }
    }
    
    public Iterator listarCidade(){

        return listaCidades.iterator();
}
}
