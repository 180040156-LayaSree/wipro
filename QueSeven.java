package Wpn;

import java.util.Scanner;

public class QueSeven {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char str  =sc.next().charAt(0);
			int v = Integer.valueOf(str);
			if(v>=65 && v<=90){
				System.out.println(String.valueOf(str).toLowerCase());
			}
			else if(v>=97 && v<=122) {
				System.out.println(String.valueOf(str).toUpperCase());
			}
			else {
				System.out.println("Invalid Input");
			}
			
		}
		
	}

}
