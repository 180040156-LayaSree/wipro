package Wpn;

import java.util.Scanner;
public class QueOne {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println(n>0?"Positive":"Negative");
			if(n==0) {
				System.out.println("Zero");
			}
		}

	}

}

