/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Usuário
 */
public class AvaliacaoHotel extends Avaliacao{
    
    public int custoBeneficio;
    public int conforto;
    public int atendimento;
    public int motivo;

    public AvaliacaoHotel(int custoEstendido, int conforto, int atendimento, String titulo, String descricao, Calendar data, int motivo) {
        super(titulo, descricao, data);
        this.custoBeneficio = custoEstendido;
        this.conforto = conforto;
        this.atendimento = atendimento;
        this.motivo = motivo;
    }
    
    /*
        Uso da interface 'Comparable' para facilitar na hora da ordenação
    */
    @Override
    public int compareTo(Avaliacao o) {
        return this.data.compareTo(o.data);
    }
    
    @Override
    public float getPontuacao(){
        return((conforto+atendimento+custoBeneficio) / 3);
    }

}
