import java.util.Scanner;
public class Homework
{ 
public static void main(String[] args){
  Scanner input = new Scanner(System.in); 
  System.out.print("Hello, what's your name?" );
  String name = input.nextLine();
  input.nextLine();
  System.out.print("What month is it? (Integer)" );
  int month = input.nextInt();
  
  System.out.print("What day is it? (Integer)" );
  int day = input.nextInt();
  
  System.out.print("What year is it? (Integer)" );
  int year = input.nextInt();
  input.nextLine();
 System.out.println("Today is " + month + "/" + day + "/" + year + "-" + name); 
  System.out.print("It was a ______, cold november day.");
  String adjective1 = input.nextLine();
  

  System.out.print("I woke up to the ________ smell of turkey roasting in the living room downstairs.");
  String smell = input.nextLine();
  

  System.out.print("I _________ down the stairs to see if I could help make the dinner.");
  String pastTenseVerb = input.nextLine();
  

  System.out.print("My mom said 'we need fresh _______ for the salad.");
  String food = input.nextLine();
  

  System.out.print("So I went and brought a tray full of _____.");
  String juice = input.nextLine();
  

  System.out.print("I couldn't believe my ______ when I got there!");
  String body=input.nextLine();
  

  System.out.print("There were __________ under the christmas tree!");
  String item2 = input.nextLine();
  

  System.out.println("It was a " + adjective1 + ", cold november day.");
  System.out.println("I woke up to the " + smell + " smell of turkey roasting in the living room downstairs. I " + pastTenseVerb);
  System.out.println("down the stairs to see if I could help make the dinner.");
  System.out.println("My mom said 'we need fresh " + food + " for the salad");
  System.out.println("so I went and brought a tray full of " + juice + ".");
  System.out.println("I couldn't believe my " + body + " when I got there!");
  System.out.println("There were " + item2 + " under the christmas tree!");
}
}
