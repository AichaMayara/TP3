
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionfilehandler.tp3;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class FileHandler {
    private String filePath;
    private Integer fileSizeInkb;
    private Integer number0fLines ;
    private ArrayList<String> fileContent;
    
    
    public FileHandler (String filePath1 )  {
        if(filePath1.equals(this.filePath)){
          System.out.println("le chemin existe");
          this.filePath="file.log";
          this.fileSizeInkb=10400;
          this.number0fLines=76;
          this.fileContent=new ArrayList();}
        else{System.out.println("le path est incorrect");}
      }

    public ArrayList readFile(String filePath) throws FileNotFoundException {
        
        ArrayList<String> fileContent = new ArrayList();
        File file1= new File(filePath);
        Scanner x= new Scanner(file1);// lecture à partir le fichier;
        while(x.hasNextLine()){
           String  nextLine= x.nextLine();
           fileContent.add(nextLine);
           
              x.close();
       }
        return fileContent;}
        
        
       

    
    public ArrayList findLinesWithPatter(String pattern) {
        
       ArrayList<String> linesWithPattern = new ArrayList();
       
       for(String line :fileContent){
       
       if(line.contains(pattern)){
             linesWithPattern.add(line);}}
            
       return linesWithPattern;}
       

    
        
       
    
    public boolean compareStrings1(String str1,String str2){
        //comparer le contenu des objets;
         return  str1.equals(str2);
        
        
    }
    public boolean compareStrings3(String str1,String str2){
         //Compare deux String ignorant les majuscules et miniscules;
                return  str1.equalsIgnoreCase(str2);
  
        
    }
    public boolean compareStrings4(String str1,String str2){
        //Elle ne compare pas les contenus des chaînes, mais plutôt les adresses mémoire des objets.
        return str1==str2;
        
    }
    public void  reverseString(int lineIndex) {
         if (lineIndex >0 && lineIndex <= fileContent.size()) {
            String line = fileContent.get(lineIndex);
            String reversedLine = new StringBuilder(line).reverse().toString();
            fileContent.set(lineIndex, reversedLine);
        } else {
            System.out.println("L'index de ligne spécifié est invalide.");
        }
       
         
         
        
        
        
    }
    public void removeDuplicates(int lineIndex){
        
     if (lineIndex > 0 && lineIndex <= fileContent.size()) {
            String line = fileContent.get(lineIndex);
            StringBuilder uniqueChars = new StringBuilder();
            for (char c : line.toCharArray()) {
                if (uniqueChars.indexOf(String.valueOf(c)) == -1) {
                    uniqueChars.append(c);
                }
            }
            fileContent.set(lineIndex, uniqueChars.toString());
        } else {
            System.out.println("L'index de ligne spécifié est invalide.");
        }
    
    
    }




}
    
       
    
    
    
       
        
        
        
    




    

