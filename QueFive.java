package Wpn;

import java.util.Scanner;

public class QueFive {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char c = sc.next().charAt(0);
			int v = Integer.valueOf(c);
			if(v>=97 && v<=122 || v>=65 && v<=90) {
				System.out.println("Aplhabet");
			}
			else if(v>=48 && v<=57) {
				System.out.println("Digital");
			}
			else {
				System.out.println("Special Character");
			}
		}
		
	}

}
