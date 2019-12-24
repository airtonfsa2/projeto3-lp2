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
public class Teatro extends PontoTuristico{
    public boolean internacional;
    public boolean publico;

    public Teatro(String nome, int ordem, String localizacao, String bairro, Cidade cidade, boolean internacional, boolean publico) {
        super(nome, ordem, localizacao, bairro, cidade);
        this.internacional = internacional;
        this.publico = publico;
    }
    
        /*
        Uso da interface 'Comparable' para facilitar na hora da ordenação
    */
    @Override
    public int compareTo(PontoTuristico o) {
        if (Float.compare(this.pontuacao, o.pontuacao) < 0) {
            return -1;
        }
        if (Float.compare(this.pontuacao, o.pontuacao) > 0) {
            return 1;
        }
        return 0;
    }
}
