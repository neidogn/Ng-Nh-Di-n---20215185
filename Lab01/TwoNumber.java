import javax.swing.JOptionPane;
public class TwoNumber {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "Result:  ";
        strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ","Input the first number",
                     JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, 
                    "Please input the second number: ", "Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double dif = num1 - num2;
        double prod = num1 * num2;
        double quot;
        if(num2 != 0){
            quot = num1/num2;
            strNotification = "Number 1: " + strNum1 + " Number 2: " + strNum2 + "\n"
                        +"Sum = " + sum + "\n"
                        +"Difference =  " + dif + "\n"
                        +"Product = " + prod + "\n"
                        +"Quotient =" + String.valueOf(quot) + "\n";
            JOptionPane.showMessageDialog(null, strNotification);

        }
        else{
            strNotification = "Number 1: " + strNum1 + " Number 2: " + strNum2 + "\n"
                        +"Sum = " + sum + "\n"
                        +"Difference =  " + dif + "\n"
                        +"Product = " + prod + "\n"
                        +"Quotient =" + "Cannot divide by 0" + "\n";
        JOptionPane.showMessageDialog(null, strNotification);
        }
        System.exit(0);
    
    }
}