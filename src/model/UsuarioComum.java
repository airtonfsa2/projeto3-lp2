/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuário
 */
public class UsuarioComum extends Usuario {
    private String emailLogin;
    private String hashSenha;

    public enum sexo{m, f};
    public String nomeCompleto;

    public UsuarioComum(String emailLogin, String hashSenha, enum sexo, String nomeCompleto) {
        this.emailLogin = emailLogin;
        this.hashSenha = hashSenha;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
    }
    
    
}
