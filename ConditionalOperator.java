import java.util.Scanner;
public class ConditionalOperator {

public static void main(String[] args) {
int num1, num2, Large;
Scanner input = new Scanner(System.in);
System.out.print("Enter first number: ");
num1 = input.nextInt();
System.out.print("Enter Second number: ");
num2 = input.nextInt();

Large = (num1>num2)? num1:num2;
System.out.println("The Large Number is = "+Large);


}
}