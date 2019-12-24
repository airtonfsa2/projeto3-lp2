/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import model.*;
//import util.QuickSort;

/**
 *
 * @author Usuário
 */
public class Controller {
    
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public static ArrayList<Cidade> listaCidades = new ArrayList<>();
    public static ArrayList<PontoTuristico> listaPontos = new ArrayList<>();
    public static ArrayList<PontoTuristico> pontosOrdenados = new ArrayList<>();
    
    /*
        Recebe os dados da view, e cadastra um usuario na lista
    */
    public static boolean CadastrarUsuario(String emailLogin, String hashSenha, int sexo, String nomeCompleto) throws NoSuchAlgorithmException{
        Usuario user = new UsuarioComum(emailLogin, hashSenha, sexo, nomeCompleto);
        
        for(Usuario u : listaUsuarios){
            if(u.equals(user))
                return false;
        }
       
        listaUsuarios.add(user);
        return true;
    }
    
    /*
        Recebe os dados da view, e retorna o usuario correspondente para a view
    */
    public static Usuario Login(String emailLogin, String senha) throws NoSuchAlgorithmException{
        
        for(Usuario u : listaUsuarios){
            if(u.Autenticar(emailLogin, senha)){
                return u;
            }
        }
        return null;
    }
    
    /*
        Recebe os dados da view, e cadastra o ponto turistico na lista de pontos turisticos e na lista de pontos ordenados por pontuacao
    */
    public static boolean CadastrarTeatro(String nome, int ordem, String localizacao, String bairro, Cidade cidade, boolean internacional, boolean publico){
        PontoTuristico ponto = new Teatro(nome, ordem, localizacao, bairro, cidade, internacional, publico);
        
        for(PontoTuristico p : listaPontos){
            if(p.equals(ponto)){
                return false;
            }
        }
        
        pontosOrdenados.add(ponto);
        pontos.add(ponto);
        return true;
    }
    
    /*
        Recebe os dados da view, e cadastra o ponto turistico na lista de pontos turisticos e na lista de pontos ordenados por pontuacao
    */
    public static boolean CadastrarHotel(String nome, int ordem, String localizacao, String bairro, Cidade cidade, boolean ar, boolean cafe){
        PontoTuristico ponto = new Hotel(nome, ordem, localizacao, bairro, cidade, ar, cafe);
        
        for(PontoTuristico p : listaPontos){
            if(p.equals(ponto)){
                return false;
            }
        }
        
        pontosOrdenados.add(ponto);
        listaPontos.add(ponto);
        return true;
    }
    
    /*
        Retorna o iterator da lista de cidades para a view
    */
    public static Iterator ListarCidades(){
        return listaCidades.iterator();
    }
    
    /*
        Recebe uma string com o nome da cidade e Retorna o iterator da lista de cidades com o nome correspondente
    */
    public static Iterator ProcurarCidade(String nome){
        ArrayList<Cidade> temp = new ArrayList<>();
        for(Cidade c : listaCidades)
            if(c.nome.equals(nome))
                temp.add(c);
        
        return temp.iterator();
    }
    
    /*
        Recebe uma cidade, e lista todos os pontos que tem a cidade em comum, e ordenando em ordem alfabbética
    */
    public static Iterator ListarPontos(Cidade c){
        ArrayList<PontoTuristico> listarpontos = new ArrayList<>();
        
        try{
            for(PontoTuristico p : listaPontos){
                if(p.cidade.equals(c)){
                    listarpontos.add(p);
                }
            }
        }catch(java.lang.NullPointerException e){
            return listarpontos.iterator();
        }
        
        PontoTuristico p[] = (PontoTuristico[]) QuickSort.sort((PontoTuristico[])listarpontos.toArray(new PontoTuristico[0]));
        ArrayList<PontoTuristico> list = new ArrayList<>(Arrays.asList((PontoTuristico[]) p));
        listarpontos = (ArrayList<PontoTuristico>) list;   
        
        return listarPontos.iterator();
    }
    /*
        Retorna o iterator da lista de pontos em ordem alfabética
    */
    public static Iterator ListarPontosOrdemAlfabetica(){
        Collections.sort(listarPontos);
        return listaPontos.iterator();
    }
    
    /*
        Retorna o iterator da lista de pontos em ordem de pontuacao, ordenada no batch do operador
    */
    public static Iterator ListarPontosOrdemPontuacao(){
        return pontosOrdenados.iterator();
    }
    
    /*
        Recebe uma string, e retorna o ponto com o nome correspondente
    */
    public static PontoTuristico ProcurarPonto(String nome){
        for(PontoTuristico p : listaPontos)
            if(p.nome.equals(nome))
                return p;
        
        return null;
    }
    
    /*
        Retorna o iterator de todos os comentarios do ponto recebido
    */
    public static Iterator ListarComentarios(PontoTuristico p){
        return p.avaliacoes.iterator();
    }
    
    /*
        Adiciona uma avaliação a determinado ponto na lista de avaliacoes pendentes no controller do operador
    */
    public static boolean AdicionarAvaliacao(PontoTuristico p, Avaliacao a){
        ControllerOperador.avPendentes.add(new AvPendente(p, a));
        return p.ReceberAvaliacao(a);
    }
    
    public void Salvar() throws IOException{
        FileWriter arq = new FileWriter("Usuarios.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
       //gravarArq.println(usuarios.get(0).getEmailLogin() + " - " + usuarios.get(0).getHashSenha() + " - " + usuarios.get(0).getNomeCompleto());
    }
}
