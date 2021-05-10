package Wpn;


public class Que13 {
	public static void main(String args[]) {
		int lowerRange = 10, higherRange = 99;  
	      while(lowerRange < higherRange) 
	      {
	         boolean flag = false;
	         for(int a = 2; a <= lowerRange / 2; ++a) 
	         {
	            if(lowerRange % a == 0)
	            {
	               flag = true;
	               break;
	            }
	         }
	         if(!flag && lowerRange != 0 && lowerRange != 1)
	             System.out.print(lowerRange + " ");
	         ++lowerRange;
	      }
	}
}
