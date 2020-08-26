Problem Statement:
Write a program that reads two numbers from the command line, the number of hours worked by an employee and their base pay rate. Then output the total pay due
 
Employee.java
public class Employee
{
public static void main(String args[])
{
int hours=Integer.parseInt(args[0]);
int pay=Integer.parseInt(args[1]);
int total=hours*pay;
System.out.println(total);
}
}
