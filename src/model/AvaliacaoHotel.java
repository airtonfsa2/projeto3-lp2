/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author airto
 */
public class AvaliacaoHotel extends Avaliacao {
    public int custoBeneficio;
    public int atendimento;
    public int conforto;

    public AvaliacaoHotel(String titulo, String descricao, Data data, int pontuacao) {
        super(titulo, descricao, data, pontuacao);
    }
    public enum motivo{viagem, trabalho, passeio, luaDeMel};

    
    
}
