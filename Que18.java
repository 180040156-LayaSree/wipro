package Wpn;

import java.util.Scanner;

public class Que18 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.nextLine();
			StringBuffer sb = new StringBuffer();
			sb.append(n);
			String rev = sb.reverse().toString();
			System.out.println(rev.equals(n) ? "Palindrome" : "Not Palindrome");
		}
	}
}
