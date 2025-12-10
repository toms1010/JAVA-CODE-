import java.util.Scanner;

public class Activity_7 

{
    
    public static int Addition(int a, int b) 
    {
        return a + b;
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        int a = scanner.nextInt();
        
        System.out.print("Enter pagid ka number: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter operation : ");
        char operation = scanner.next().charAt(0);
        
        switch(operation) {
            case '+':
                System.out.println("A: " + Addition(a, b));
                break;
            case '-':
                System.out.println("B: " + (a - b));
                break;
            case '*':
                System.out.println("C: " + (a * b));
                break;
            case '/':
                System.out.println("D: " + (a / b));
                break;
            default:
                System.out.println("Invalid gani");
        }
        
        HelloStatement();
        scanner.close();
    }
    
    public static void HelloStatement() {
        System.out.print(" ohhh lantawa completo na ang code mo!");
    }
}