/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionfilehandler.tp3;

/**
 *
 * @author user
 */
public class XOR {
    public static void main(String[] args) {
      String key="secret" ;
      String plaintext="Hello, world";
      XORCipher xorCipher=new XORCipher(key);
      //Chiffrement du texte clair;
      StringBuilder encryptedText = xorCipher.Encrypt(plaintext);
      System.out.println("Texte chiffré :"+ encryptedText);
      
      // Déchiffrement du texye clair;
      String decrypted = xorCipher.Decrypt( encryptedText);
      System.out.println("texte déchiffré :" + decrypted);
      
      
      
        
    }
    
}
