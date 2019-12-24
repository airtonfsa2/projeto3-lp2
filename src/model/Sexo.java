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
public enum Sexo {
    MASCULINO(0), FEMININO(1), OUTROS(2);
    
    private final int valor;
    Sexo(int valorOpcao){
        valor = valorOpcao;
    }
}
