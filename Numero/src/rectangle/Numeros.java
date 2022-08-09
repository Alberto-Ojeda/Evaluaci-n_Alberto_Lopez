/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class Numeros {
    public void randomplay(){
        Scanner sc = new Scanner(System.in); //Se crea el lector

        double random=0;
        random = Math.random()*100;
        System.out.println(Math.round(random));
        for (int i = 0; i < 5; i++) {                     
        System.out.println("Adivina el número");
        String number = sc.nextLine(); 
        if (Integer.parseInt(number)== Math.round(random)) {
            System.out.println("felicidades adivinaste");
            break;
        }if (Integer.parseInt(number)> Math.round(random)) {
            System.out.println("el numero es mas pequeño");
            }else{
            System.out.println("el numero es mas grande");
        }
        
        }
        
    }
    
    public static void main(String[] args) {
        Numeros num = new Numeros();
        num.randomplay();
    }
    
}
