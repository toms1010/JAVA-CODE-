package jo_activity;

import javax.swing.JOptionPane;

public class JO_Activity 
{

    public static void main(String[] args) 
    {

        String adminUsername = "admin";
        String adminPassword = "admin123";

        while (true)
        { 
            String username = JOptionPane.showInputDialog(
                    null, 
                    "Username:"
            );
            if (username == null) 
            { 
                JOptionPane.showMessageDialog
        (
                        null, 
                        "Program terminated.", 
                        "Exit", 
                        JOptionPane.INFORMATION_MESSAGE
        );
                    System.exit(0); 
            }

            String password = JOptionPane.showInputDialog
        (
                null, 
                "Password:"
        );
            if (password == null) 
            { 
                JOptionPane.showMessageDialog
        (
                null, 
                "Program terminated.", 
                "Exit", 
                JOptionPane.INFORMATION_MESSAGE
        );
                System.exit(0);
                
            }

            if (username.equals(adminUsername) && password.equals(adminPassword)) 
            {
                JOptionPane.showMessageDialog
        (
                null, 
                "Welcome, Admin!", 
                "Success", 
                JOptionPane.INFORMATION_MESSAGE
        );

               
                int choice = JOptionPane.showConfirmDialog
        (
                null, 
                "Do you want to access admin settings?", 
                "Admin Option", 
                JOptionPane.YES_NO_OPTION
        );
                if (choice == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog
        (
                null, 
                "Accessing admin settings...", 
                "Admin", 
                JOptionPane.INFORMATION_MESSAGE
        );
                }
                break; 
            } else {
              
                JOptionPane.showMessageDialog
        (
                null, 
                "Invalid username or password!", 
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
                
            }
        }
    }
}
