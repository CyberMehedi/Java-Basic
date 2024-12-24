import javax.swing.JOptionPane;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
       
            
            String widthInput = JOptionPane.showInputDialog("Enter the width of the rectangle:");
            double width = Double.parseDouble(widthInput);

         
            String heightInput = JOptionPane.showInputDialog("Enter the height of the rectangle:");
            double height = Double.parseDouble(heightInput);

        
            double area = width * height;

            
            JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area, "Error", JOptionPane.ERROR_MESSAGE);
           }
}