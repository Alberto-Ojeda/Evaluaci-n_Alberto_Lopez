/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alberto
 */
public class Exercise2 {
    public void list(){
        String iterado="";
        List<String> list2 = new LinkedList<String>();
        list2.add("juan");
        list2.add("pedro");
        list2.add("jose");
        list2.add("maria"); 
        list2.add("sofia");
        for (String string : list2) {
            for (int i = 0; i < string.length(); i++) {
                if (i==0) {
                iterado = iterado + String.valueOf(string.charAt(i)).toUpperCase();                    
                }else{
                 iterado = iterado + String.valueOf(string.charAt(i));
                }

            }
                            System.out.println(iterado);
                                                iterado="";


            
        }
        
    }
    public static void main(String[] args) {
        Exercise2 exer = new Exercise2();
        exer.list();
        
        
    }
}
