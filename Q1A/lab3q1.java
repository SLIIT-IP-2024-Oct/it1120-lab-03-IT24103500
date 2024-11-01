import java.util.Scanner;
public class Lab3Q1{
     public static void main(String []args){
	int kilo;
	int price;
	int x;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter no of kilo :");
	kilo=input.nextInt();

	System.out.println("Enter price in one kilo :");
	price=input.nextInt();

	x=kilo*price;
	System.out.println("Total price :"+x);

}
}
