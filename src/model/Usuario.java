/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.NoSuchAlgorithmException;
import util.HashSenha;

/**
 *
 * @author Usuário
 */
public abstract class Usuario {
    public String emailLogin;
    public String hashSenha;
    public int sexo;
    public String nomeCompleto;
    public Cidade cidadePrincipal;
    

    public Usuario(String emailLogin, String Senha, int sexo, String nomeCompleto) throws NoSuchAlgorithmException {
        this.emailLogin = emailLogin;
        this.hashSenha = HashSenha.GerarHash(Senha);
        this.sexo = sexo;
        this.nomeCompleto = nomeCompleto;
    }

    public Usuario() {    
    }

    public boolean Autenticar(String email, String senha) throws NoSuchAlgorithmException{
        String hash = HashSenha.GerarHash(senha);
        
        if(emailLogin.equals(email) && hashSenha.equals(hash)){
            return true;
        }
        return false;
    }
    
    public abstract Usuario Promocao();
}

