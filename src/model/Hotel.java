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
public class Hotel extends PontoTuristico{
    public int estrelas;
    public int preco;
    public boolean ar;
    public boolean cafe;

    public Hotel(String nome, int ordem, String localizacao, String bairro, Cidade cidade, boolean ar, boolean cafe) {
        super(nome, ordem, localizacao, bairro, cidade);
        this.ar = ar;
        this.cafe = cafe;
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
