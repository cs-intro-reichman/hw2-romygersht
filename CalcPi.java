// Computes an approximation of PI.
public class CalcPi {

	public static void main(String [] args) { 
	   
    int num = Integer.parseInt(args[0]); //numer input
	double sum = 0; //the sum of the elements
	double one = 1;

	for (int i=0; i < num; i++) { // a loop that sums the elements as many times as the number in the input
	    double element = one / ((2*i) + 1); //calculate the specipic element 
		sum += element;
		one *= -1;
	}
	System.out.println("pi according to Java: "+Math.PI);
    System.out.println("pi, approximated:     "+sum*4);

	//System.out.println("pi according to Java: " + Math.PI); //the answer*4 because it returns pai/4
	//System.out.println("pi, approximated:     " + sum*4);
	}
}
