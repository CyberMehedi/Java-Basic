import java.util.Scanner;
class Triangledemo {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double base, height;
System.out.print("Enter base : ");
base=input.nextDouble();

System.out.print("Enter height : ");
height=input.nextDouble();

double area = 0.5 * base * height;
System.out.print("The area of triangle is :  "+area);



}
}