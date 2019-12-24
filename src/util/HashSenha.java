/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Usuário
 */
public class HashSenha {
    public static String GerarHash(String senha) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
        String hashSenha = hash.toString(16);
        System.out.println(hashSenha);
        
        return hashSenha;
    }
}
