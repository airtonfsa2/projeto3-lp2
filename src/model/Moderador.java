/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuário
 */


//** Classe moderador

public class Moderador extends Usuario{

    public Moderador(String emailLogin, String Senha, int sexo, String nomeCompleto) throws NoSuchAlgorithmException {
        super(emailLogin, Senha, sexo, nomeCompleto);
    }

    public Moderador() {
    }
    
    //** Método usado para promover usuários em ADM'S

    @Override
    public Usuario Promocao() {
                Admin a = new Admin(cidadePrincipal, emailLogin, hashSenha, nomeCompleto);
     
        a.cidadePrincipal = cidadePrincipal;
        a.emailLogin = emailLogin;
        a.hashSenha = hashSenha;
        a.nomeCompleto = nomeCompleto;
        a.sexo = sexo;
        
        return a;
    }
}
