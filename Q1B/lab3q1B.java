import java.util.Scanner;
public class Lab3Q1{
     public static void main(String []args){
	double kilo;
	double price;
	double x;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter no of kilo :");
	kilo=input.nextDouble();

	System.out.println("Enter price in one kilo :");
	price=input.nextDouble();

	x=kilo*price;
	System.out.println("Total price :"+x);
	
	double dis;
	dis = x * 0.1;
	System.out.println("Discount : "+ dis);
	

}
}
