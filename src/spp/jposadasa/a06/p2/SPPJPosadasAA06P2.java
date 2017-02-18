
package spp.jposadasa.a06.p2;
import java.util.*;
public class SPPJPosadasAA06P2 {

    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
        int num, mult = 1;
        
        System.out.println("Porafvor introduzca un numero entero entre 0 y 10");
        num = kb.nextInt();
        
        if (num>0 && num<=10){
        for (int i=1; i<=num ; i++){
           
         mult = mult * i;
            
                 }
            System.out.println("El factorial es: " + mult);
        } else System.out.println("El numero no esta en el rango");
    }
}