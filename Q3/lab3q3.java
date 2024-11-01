import java.util.Scanner;
public class Lab3Q3{
     public static void main(String []args){
	int price;
	int amount,n5000,n1000,n500,n100,n50,n20;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter price :");
	price=input.nextInt();
	
	n5000=price/5000;
	System.out.println("no of 5000 : "+ n5000);
	amount=price%5000;
	n1000=amount/1000;
System.out.println("no of 1000 : "+ n1000 );
	amount=price%1000;
	 n500=amount/500;
System.out.println("no of 500 : "+ n500 );
amount=price%500;
	 n100=amount/100;
System.out.println("no of 100 : "+ n100 );
amount=price%50;
	 n50=amount/50;
System.out.println("no of 50 : "+ n50 );
	
	
	

}
}