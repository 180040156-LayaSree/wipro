package Wpn;

import java.util.Scanner;

public class Que15 {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			int s =0;
			for(int i=0;i<str.length();i++) {
				s=s+(str.charAt(i)-'0');
			}
			System.out.println(s);
		}
	}

}
