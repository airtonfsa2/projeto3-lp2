/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Usuário
 */

//** Classe Admin para definir quem pode ter privilégios de administrador

public class Admin extends Usuario{
    public Admin(String emailLogin, String Senha, enum sexo, String nomeCompleto) throws NoSuchAlgorithmException {
        super(emailLogin, Senha, sexo, nomeCompleto);
    }

    public Admin() {
    }
    
    
    @Override
    public Usuario Promocao() {
        return this;
    }
}
