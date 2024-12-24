class ProfessorParameter{

String name, gender;
int phone;
public static void main(String[]args){

ProfessorParameter professor1 =new ProfessorParameter();

professor1.SetInformation("Md Mehedi Hasan", "male",123456789);

professor1.DisplayInformation();


ProfessorParameter professor2=new ProfessorParameter();
professor2.SetInformation("Hasan Mithu","male", 987654321);
professor2.DisplayInformation();

}

public void SetInformation(String n, String m, int ph){

name = n;
gender = m;
phone = ph;


}

public void DisplayInformation()
{

System.out.println("Name is "+name);
System.out.println("Gender is "+gender);
System.out.println("Phone number is "+phone);
System.out.println("\n");

}
}