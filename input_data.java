import java.util.Scanner;
public class input_data {

    public static void main(String[] args) 
    {
       String x;
        int y;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter Name: ");
        
        x = scan.nextLine();
        // Line is for only the string 
     
        System.out.println("You are " + x);
        System.out.print("Enter Your Age: ");
        y = scan.nextInt();
        System.out.println("This is your Age "+ y);
        
        
       /*
        this is the for the User Input 
        nextLine()
        nextInt()
        nextLong()
        nextByte()
        nextBoolen()
        nextDouble()
        nextFloat()
        
        */
    }
}
