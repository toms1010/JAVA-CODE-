package library;

import javax.swing.JOptionPane;

public class Library {

    public static void main(String[] args) {

//        String name = JOptionPane.showInputDialog("Crush: Hi 😊 What’s your name?");
//        
//        JOptionPane.showMessageDialog(
//            null,
//            "You: Hi! I’m " + name
//        );
//
//        JOptionPane.showMessageDialog(
//            null,
//            "Crush: Nice to meet you, " + name + " 💕hsi"
//        );
//
//        String reply = JOptionPane.showInputDialog(
//            "Crush: Kumusta ka?"
//        );
//
//        JOptionPane.showMessageDialog(
//            null,
//            "You: " + reply
//        );
//
//        JOptionPane.showMessageDialog(
//            null,
//            "Crush: Ay wow hahaha ingat ka lagi!"
//        );

        int choice =JOptionPane.showConfirmDialog
                (
                        null, 
                        "Do you want to Change?", 
                        "Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION
                );
        
        
        if (choice == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, " YES_OPTION");
        }
        else if (choice== JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,"NO_OPTION");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "CANCEL_OPTION");
        }
        
        
        
    }
}
