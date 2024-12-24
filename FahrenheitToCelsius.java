import java.util.Scanner;
class FahrenheitToCelsius {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double Fahrenheit, Cel;
System.out.print("Enter Fahrenheit: ");
Fahrenheit=input.nextDouble();
Cel = 0.6*Fahrenheit-32;
System.out.print("Fahrenheit to Celsius result is : "+Cel);

}
}