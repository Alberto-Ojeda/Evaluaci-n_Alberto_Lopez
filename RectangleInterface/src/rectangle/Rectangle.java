/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

import interfaz.rectangle.view.Forma;

/**
 *
 * @author alberto
 */
public class Rectangle {
    float a=12;
    float b=12;
    float area=0;

    Forma form = new Forma() {
        public float CalculaArea(float a, float b) {
            return area=a*b ;
        }
    }; 
    
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();        
        System.out.println(rectangle.form.CalculaArea(4, 3));        
    }
    
    
}
