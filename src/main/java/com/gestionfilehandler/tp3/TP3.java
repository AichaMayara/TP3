/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gestionfilehandler.tp3;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class TP3{

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("file.log");
        
        int lineIndexToReverse =1;
        fileHandler.reverseString(lineIndexToReverse);
        
        
        int lineIndexToRemoveDuplicates =2;
        fileHandler.removeDuplicates(lineIndexToRemoveDuplicates );
        
        String  pattern ="epoch";
        ArrayList<String> linesWithPattern= fileHandler.findLinesWithPatter(pattern);
         
        String str1="hello";
        String str2="Hello";
        System.out.println("comparaison avec equals :"+fileHandler.compareStrings1(str1,str2));
        
        String str5 ="hello";
        String str6 ="HELLO";
        System.out.println("comparaison avec equalsIgnoreCase :"+fileHandler.compareStrings3(str5, str6));
        
        String str7 ="hello";
        String str8 ="hello";
        System.out.println("comparaison avec == :"+fileHandler.compareStrings4(str7, str8));
        System.out.println("comparaison avec == :"+ fileHandler.compareStrings4(new String("hello"),"hello"));
        System.out.println("comparaison avec == :"+fileHandler.compareStrings4(new String("hello"), new String ("hello")));
        System.out.println("ligne contenant le motif "+ pattern+ " :" + linesWithPattern.get(0));
        
        
        
        
        
        
        
    }
}
