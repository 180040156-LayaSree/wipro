package Wpn;

import java.util.Scanner;

public class QueTwelve {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int c= 0;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					c++;
				}
			}
			System.out.println(c<2?"Prime":"Not Prime");
		}
	}
}
