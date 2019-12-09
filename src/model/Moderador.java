/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import controller.Controlador;
/**
 *
 * @author Aluno
 */
public class Moderador extends Usuario {
    private String nome;
    
    List<Cidade> listaCidades = new ArrayList<>();
    
    public void cadastrarCidade(String nome){
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Informe o nome da cidade: ");
        
        String cidade;
        
        cidade = s1.nextLine();
        
        System.out.println("Informe o estado: ");
        
        String estado;
        
        estado = s1.nextLine();
        
        System.out.println("Informe o pais: ");
        
        String pais = s1.nextLine();
        
        Cidade c1 = new Cidade(cidade, estado, pais);
        
        listaCidades.add(c1);
        
    }
    
    public void listarCidades(){
    
    }
}
