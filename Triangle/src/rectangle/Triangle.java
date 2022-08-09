/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author alberto
 */
public class Triangle {
    //l for+1
    //23
    //456
    //78910
    //lllll
    public void triangle(int n){
        int j=1;
        int interncount = 2;
        String savenumber="";
        if (n>=interncount) {                 
        for (int i = 0; i < n; i++) {
             for (j = 1; j < interncount; j++) {
                 
                 savenumber = savenumber + String.valueOf(j); 
            }
             System.out.println(savenumber);
             savenumber="";
             interncount=interncount+1;
        }
        }        
    }
    
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        
        triangle.triangle(4);
    }
    
}
