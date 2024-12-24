class ProfessorCode{

String name, gender;
int phone;
public static void main(String[]args){

ProfessorCode professor1 =new ProfessorCode();
professor1.name ="Md Mehedi Hasan";
professor1.gender = "male";
professor1.phone =123456789;

professor1.DisplayInformation();


ProfessorCode professor2=new ProfessorCode();
professor2.name ="Hasan Mithu";
professor2.gender = "male";
professor2.phone =987654321;

professor2.DisplayInformation();


}
public void DisplayInformation()
{

System.out.println("Name is "+name);
System.out.println("Gender is "+gender);
System.out.println("Phone number is "+phone);
System.out.println("\n\nc");





}



}