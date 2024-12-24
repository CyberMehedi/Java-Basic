import java.util.Scanner;
class Assignment3{
public static void main(String [] args){

int id, price;
String title, description,category ;
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
id =input.nextInt();
System.out.print("Enter a price: ");
price = input.nextInt();
System.out.print("Enter a title: ");
input.nextLine();
title = input.nextLine();
System.out.print("Enter a description :");
description =input.nextLine();
System.out.print("Enter a category: ");
category = input.nextLine();


System.out.println ("id = "+id);
System.out.println ("price = "+price);
System.out.println ("title = "+title);
System.out.println ("description = "+description);
System.out.println ("category = "+category);

}
}