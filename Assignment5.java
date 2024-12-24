import java.util.Scanner; 
class Assignment5 {
public static void main(String[] args){
int num;

Scanner input= new Scanner(System.in);
System.out.print("Enter a number: ");
num = input.nextInt();
if(num>=18){

System.out.print("The person is valid Voter:  ");
}
else{
System.out.print("The person is not valid Voter:  ");

}

}
}