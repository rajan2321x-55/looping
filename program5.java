package Looping;

import java.util.Scanner;
public class progarm5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter input :");
		int n=sc.nextInt();
		int f=1;
		System.out.println("output:");
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("product of "+n+" values:"+f);
		
	

	}

}
