public class Question3 {
	
	static long collazNumber(long n) {
		long collazNumber=0;
		while(n!=1) {
			if(n%2==0) 
				n/=2;
			else
				n = 3*n+1;
			collazNumber++;
		}
		return collazNumber;
		
	}
	public static void main(String[] args) {
		long max = 0, num=0;	
		for(int i=1; i<499999; i++) {
			long collazNumber_i = collazNumber(2*i+1);
			if(collazNumber_i>max) {
				max = collazNumber_i;
				num=2*i+1;
			}
		}
		System.out.println("largest Collaz Number is "+max+" for "+num);

	}

}
