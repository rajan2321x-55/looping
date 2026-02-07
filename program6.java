package Looping;

import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {


		 Scanner sc=new Scanner(System.in);
		  

		 int sum=0;
		 System.out.println("enter inputs values:");
		 int n=sc.nextInt();
		 
		
		 int a;
		 for(int i=1;i<=n;i++)
		 {
		 System.out.println("enter numbers:");
		  a=sc.nextInt();
		 int f=1;
		 for(int j=1;j<=a;j++)
		 {
		  f*=j;

		 }

		  sum+=f;
		 }
		 
		System.out.println("sum of all factorial is="+sum);
	

	}

}
