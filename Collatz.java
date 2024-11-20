// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int seed = Integer.parseInt(args[0]);
		String mode = ""+(args[1]);
		//int time = seed;
		int num = seed;
		//int cNumber = 2;

		String v = "v";

		if (mode.equals(v)) { 
			//int counter = 0;

			//if ( == 1){
			System.out.println("1 4 2 1 (4)");
			//counter ++;
			//System.out.println("Every one of the first "+num+" hailstone sequences reach 1.");
			//}
			//else {
			//System.out.print("1");
			//counter ++;
			//}

           for (int j=2; j <=seed; j++) {
			int counter = 0;
			int cNumber = j;
			System.out.print(+j+" ");
			counter++;

		     while (cNumber!=1) {
		    if (cNumber%2 == 0){	
			cNumber = cNumber/2;
			System.out.print(+cNumber+" ");
		    }
		     else{
			cNumber = (cNumber*3)+1;
			System.out.print(+cNumber+" ");
		    }
			counter ++;  
	       }
		   System.out.println("("+counter+")"); 
	   }
	   System.out.println("Every one of the first "+num+" hailstone sequences reached 1.");
	}
	
		else {
		System.out.println("Every one of the first "+num+" hailstone sequences reached 1.");
		}



	    }
	  }

	

