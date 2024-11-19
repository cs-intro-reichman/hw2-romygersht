// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int seed = Integer.parseInt(args[0]);
		String mode = ""+(args[1]);
		//int time = seed;
		int num = seed;
		int cNumber = 0;

		String v = "v";

		if (mode.equals(v)) {

           for (int j=1; j <=seed; j++) {
			int counter = 0;
		     while (cNumber!=1) {

		    if (j%2 == 0){	
			cNumber = j/2;
			System.out.print(+cNumber+" ");
			counter ++;
		    }
		     else{
			cNumber = (cNumber*3)+1;
			System.out.print(+cNumber+" ");
			counter ++;
		    }  
	       }
		   System.out.println(" ("+counter+")"); 
	   }
	   System.out.println("Every one of the first "+num+" hailstone sequences reach 1.");
	}
	
		else {
		System.out.println("Every one of the first "+num+" hailstone sequences reach 1.");
		}
	    }
	  }

	

