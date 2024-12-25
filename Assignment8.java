import java.util.Scanner;
public class Assignment8 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Answer Example: Y/y or N/n  ");
System.out.print("Have you completed your masters?");
char ch = input.next().charAt(0);
System.out.print(" Are you fulent in English?  ");
char ch2 = input.next().charAt(0);

if (ch=='Y'||ch=='y'&& ch2=='Y'||ch2=='y'){
System.out.println("You are eligible to for the job interview");
}
else if (ch=='N'||ch=='n'&& ch2=='N'||ch2=='n'){
System.out.println("Sorry. you are not eligible to for the job interview");
}
else{
System.out.println("Your input is wrong");
}

}
}
