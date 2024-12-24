import java.util.Scanner;
class CelsiustoFahrenheit {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double Celsius, F;
System.out.print("Enter Celsius: ");
Celsius=input.nextDouble();
F= 1.8*Celsius*32;
System.out.print("Celsius to Fahrenheit result is : "+F);

}
}