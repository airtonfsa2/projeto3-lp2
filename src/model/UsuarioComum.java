/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.Login;

/**
 *
 * @author airto
 */
public class Usuario extends Usuario {
    public String emailLogin;
    public String hashSenha;

    public enum sexo{m, f};
    public String nomeCompleto;

    public Usuario(String emailLogin, String hashSenha, enum sexo, String nomeCompleto) {
        this.emailLogin = emailLogin;
        this.hashSenha = hashSenha;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
    }
    
    
}
