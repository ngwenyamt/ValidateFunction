import javax.swing.*;
public class Validation {
    public static void main(String[] args) {
        String cellphoneNumber;
        cellphoneNumber= JOptionPane.showInputDialog("Please enter your cellphone number = ) ");
        if (validateSAPhoneNumber(cellphoneNumber)) {
            JFrame frame = new JFrame("Input Dialog");
            JOptionPane.showMessageDialog(frame,
                    "Cellphone number is valid =)");
            System.exit(0);
        }else
        {
            JFrame frame = new JFrame("Output Dialog");
            JOptionPane.showMessageDialog(frame,
                    "Cellphone number is invalid =(");
            System.exit(0);
        }
    }
    public static boolean validateSAPhoneNumber(String cellphoneNumber) {
        if(cellphoneNumber.matches("^((?:\\+27|27)|0)(\\d{2})-?(\\d{3})-?(\\d{4})$")){
            return true;
        }else{
            return false;
        }
    }
}