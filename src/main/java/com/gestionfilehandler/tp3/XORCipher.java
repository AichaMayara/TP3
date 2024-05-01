/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionfilehandler.tp3;





/**
 *
 * @author user
 */
public class XORCipher {
    private String key;
    
    
    
    public XORCipher(String key1){this.key=key1;}
    
    
    
    public StringBuilder Encrypt(String plaintext) {
        // Chiffrer le texte en clair avec la clé
         byte[] keyBytes = key.getBytes();
       // Initialiser un StringBuilder pour stocker le texte chiffré
        StringBuilder encryptedText = new StringBuilder();
        
        for (int i = 0; i < plaintext.length(); i++) {
             char plainChar = plaintext.charAt(i);
             char encryptedChar = (char) (plainChar ^ keyBytes[i % keyBytes.length]);
               encryptedText.append(encryptedChar);
        
                         } 
                  return encryptedText;}
        
        
       
    
        
        
    public String Decrypt(String ciphertext) {
        byte[] keyBytes = key.getBytes();
        StringBuilder decryptedText = new StringBuilder();
                
         for (int i = 0; i < ciphertext.length(); i++) {
            // Récupérer le caractère courant du texte chiffré
            char encryptedChar = ciphertext.charAt(i);
            // XOR du caractère du texte chiffré avec le caractère correspondant de la clé
            char decryptedChar = (char) (encryptedChar ^ keyBytes[i % keyBytes.length]);
            // Ajouter le caractère déchiffré au texte déchiffré
            decryptedText.append(decryptedChar);
        }
        // Renvoyer le texte déchiffré
        return decryptedText.toString();}

    String Decrypt(StringBuilder encryptedText) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    }
