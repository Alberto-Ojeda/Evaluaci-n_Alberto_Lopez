/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author alberto
 */
//sintaxis de las listas
/*List<String> list1 = new ArrayList<>();
list1.add("India");
list1.add("China");
list1.add("Bhutan");
// ArrayList
List<String> list1 = new ArrayList<String>();
 
// LinkedList
List<String> list2 = new LinkedList<String>();
 
// Vector
List<String> list3 = new Vector<String>();
 
// CopyOnWriteArrayList
List<String> list4 = new CopyOnWriteArrayList<String>();
 
*/

public class condicionales {
    
    public void condicionales(int a,int b,int c){
        if (a>b && a>c && b>c ) {
            System.out.println(a+" "+b+" "+c);
        }if (a>b && a>c && c>b) {
               System.out.println(a+" "+c+" "+b);
        }
        
        if (b>a && b>c && a>c ) {
            System.out.println(b+" "+a+" "+c);
            
        }if (b>a && b>c && a<c) {
           System.out.println(b+" "+c+" "+a);
        }
        if(c>a && c>b && a>b  ) {
            System.out.println(c+" "+a+" "+b);
            
        }if(c>a && c>b && a<b ) {
            System.out.println(c+" "+b+" "+a);
            
        }


        
        
    }
    public static void main(String[] args) {
        condicionales condi = new condicionales();
        condi.condicionales(22, 13, 6);
    }
    
}
