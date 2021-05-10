package Wpn;

import java.util.Scanner;

public class QueTwentyTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int f=sc.nextInt();
		boolean b=false;
		for(i=0;i<n;i++)
		{
			if(f==a[i])
			{
				b=true;
				break;
			}
		}
		if(b==true)
		{
			System.out.print(i);
		}
		else
		{
			System.out.print("-1");
		}
	}

}
