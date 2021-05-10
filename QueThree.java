package Wpn;

public class QueThree {
	public static void main(String args[]) {
		int l = args.length;
		if(l==0) {
			System.out.println("No Values");
		}
		else {
			for(String s : args) {
				System.out.print(s+" ");
			}
		}
	}

}
