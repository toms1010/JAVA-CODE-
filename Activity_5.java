


import java.util.Scanner;
public class Activity_5 
{


    public static void main(String[] args) {
         int num1, num2, num3;
         int sum;
         String result;
         Scanner input = new Scanner (System.in);
         
         System.out.print("Enter 1st Number: ");
         num1=input.nextInt();
         System.out.print("Enter 2nd Number: ");
         num2=input.nextInt();
         System.out.print("Enter 3rd Number: ");
         num3=input.nextInt();
         
         sum = num1+num2+num3;
         
         if (sum %2 == 0)
         {
             result = " even";
         } 
         else 
         {
             result = " odd";
         }
          System.out.println("The sum is " + sum + result);
         
         
         
         
        
    }
    
}
