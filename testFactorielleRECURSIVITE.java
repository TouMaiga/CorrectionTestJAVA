package testsamedi;

public class testFactorielleRECURSIVITE {

     // factorielle 
		  public static int factorial(int n) {
			  int f = n;
		     for (int i= n-1; i>0; i--) {
		    	 f=f*i; 
		     }
		        return n;
		    }	
		    	
		    public static void main(String[] args) {
		    	int f = factorial(3);
		    	System.out.print(f);
		    }
}