package Wpn;

public class Que19 {

	public static void main(String[] args) {
		int c = 0;
		for (int i = 1; c < 5; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " ");
				c++;
			}
		}
	}

}
