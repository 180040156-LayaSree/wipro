package Wpn;

import java.util.Scanner;

public class QueFour {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			char c1 = sc.next().charAt(0);
			char c2 = sc.next().charAt(0);
			System.out.println(c1<c2?c1+" "+c2:c2+" "+c1);
		}

	}

}
