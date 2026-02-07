package Looping;

import java.util.Scanner;
public class program7 {

	public static void main(String[] args) {


		
Scanner sc=new Scanner(System.in);
System.out.println("enter inputs:");
int n=sc.nextInt();
int c=0,s=0;
for(int i=1;i<=n;i++)
{
	if(i%2==0)
	{
		c=c+i;
	}

	else
	{
	s=s+i;
 }

	}
System.out.println("Output:");
System.out.print("sum of even="+c);
System.out.print(",sum of odd="+s);


	}

}
