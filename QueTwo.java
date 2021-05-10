package Wpn;

import java.util.Scanner;

public class QueTwo {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			System.out.print((n&1)==1?"Odd":"Even");;
		}

	}

}
