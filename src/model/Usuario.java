/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public abstract class Usuario {
    public String emailLogin;
    public String hashSenha;
    
    public boolean autentica(String login, String senha){
        if(login.equals(emailLogin)&& senha.equals(hashSenha))
            return true;
    
        return false;
    }
    
}
