import java.util.Scanner; 
class IfElsePositiveDemo{
public static void main(String[] args){
int num;

Scanner input= new Scanner(System.in);
System.out.print("Enter a number: ");
num = input.nextInt();
if(num>0){

System.out.print("Number is positive:  ");
}
else{
System.out.print("Number is Negative:  ");

}
}
}