Problem Statement:
There are exactly 2.54 centimeters to an inch. Write a program that takes a number of inches from the command line and converts it to centimeters.


Inch.java
public class Inch {

	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
double b=a*2.54;
System.out.println(b);

}
}

