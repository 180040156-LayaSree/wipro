package Wpn;

import java.util.Scanner;

public class QueTwenty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		double avg=sum/n;
		System.out.print(sum+" "+avg);
	}

}
