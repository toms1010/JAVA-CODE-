

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;
public class Activity_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
       
        
        Scanner datain = new Scanner(System.in);
        
//       String cel = "in Celsius: ";
        char name ='C'; 
        char name2 ='F'; 
        System.out.println("Ist");
        System.out.println("in Celsius: ");
        int c1 = datain.nextInt();
       
        double f1 = (c1*9/5)+32;
         System.out.println();
                 
        System.out.println(c1+ "C-F = "+ f1+ "F") ;
        System.out.println();
        System.out.println("2nd");
        System.out.println("in Fahrenheit: ");
        int  f2= datain.nextInt();
        double c2 =  (f2*5/9)+32;
        System.out.println();
        System.out.println(f2+ "F-C = "+ c2+ "C") ;
        
       
        
        
    }
    
}
