package Wpn;

import java.util.Scanner;

public class QueEight {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			char  str = sc.next().toUpperCase().charAt(0);
			switch(str) {
				case('R'):
					System.out.println("Red");
					break;
				case('B'):
					System.out.println("Blue");
					break;
				case('G'):
					System.out.println("Green");
					break;
				case('o'):
					System.out.println("Orange");
					break;
				case('y'):
					System.out.println("Yellow");
					break;
				case('w'):
					System.out.println("White");
					break;
				default:
					System.out.println("Invalid");
					break;
			}
		}
	}

}
