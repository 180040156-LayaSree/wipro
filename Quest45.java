package wiprotra;

public class Quest45{
	  double h,w,d;

	  Quest45(double width,double height,double depth)
	    {
	        h=height;
	        w=width;
	        d=depth;
	    }
	    double volume()
	    { double v;
	    v=h*w*d;
	    return v;
	    }
	   
	    public static void main(String[] args) {
	       
	    	Quest45 bc = new Quest45(8.5,80.3,9.6);
	    System.out.println(bc.volume());

	    }

}
