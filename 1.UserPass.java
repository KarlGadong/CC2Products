package account;

import java.util.*;
import javax.swing.*;

public class Account {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        JOptionPane.showInputDialog(null, "Enter Username: ");
        String user = sn.nextLine();
        JOptionPane.showInputDialog(null, "Enter Password: ");
        String pass = sn.nextLine();
        JOptionPane.showInputDialog(null, "Retype Password: ");
        String passR = sn.nextLine();

        if (pass.equals(passR)) {
            JOptionPane.showMessageDialog(null, "Correct Password");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Password");
        }
    }

}
