
public class AdditionalProblem1 {
	
	static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}

	public static void main(String[] args) {
		for(int i=1; i<7; i++) {
			System.out.print(factorial(i)+"/"+(i*i)+" ");
		}
	}

}
