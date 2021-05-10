package Wpn;

import java.util.Scanner;

public class QueTwentyOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0],max=a[1];
		for(int j=0;j<n;j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.print(max+" "+min);
	}
}
