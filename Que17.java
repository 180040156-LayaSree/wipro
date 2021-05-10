package Wpn;

import java.util.Scanner;

public class Que17 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String  n = sc.nextLine();
			StringBuffer sb = new StringBuffer();
			sb.append(n);
			System.out.println(Integer.valueOf(sb.reverse().toString()));
		}
	}
}
