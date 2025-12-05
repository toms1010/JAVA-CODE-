public class Activity_6 {
    public static void main(String[] args) {

        for (int num = 1; num <= 20; num++) {   // Loop 1 to 20

            int n = num;       
            String roman = ""; 

            while (n >= 10) { roman += "X"; n -= 10; }       
            if (n == 9) { roman += "IX"; n -= 9; }           

            if (n >= 5) { roman += "V"; n -= 5; }            
            if (n == 4) { roman += "IV"; n -= 4; }           

            while (n >= 1) { roman += "I"; n -= 1; }       

            System.out.println(num + " = " + roman);
        }
    }
}
