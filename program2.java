package Looping;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		System.out.print("odd:");
		for(int i=1;i<=n;i+=2)
		{
			
			if(i%2!=0)
			{
				System.out.print(i+"\t");
			}}
		System.out.print("even:");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) {
				
				System.out.print(i+"\t");
			}
		}
		
		

	}

}
