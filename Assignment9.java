/* program (problem):
switch assignment: call center
if user select option 1 then set language Bengali 
if user select option 2 then set language Hindi 
if user select option 3 then set language Urdu
for any other option set language English */




import java.util.Scanner;
public class Assignment9 {

public static void main(String[] args) {
int Option;
Scanner input = new Scanner(System.in);
System.out.print("Enter an option between 1-3: ");
Option = input.nextInt();
switch(Option){

case 1:
System.out.println("Selected language is Bengali");
break;
case 2:
System.out.println("Selected language is Hindi");
break;
case 3:
System.out.println("Selected language is Urdu");
break;
default:
System.out.println(" Selected language is English");


}
}
}