public class Question6 {
	
	static boolean isPrime(int n) {
		int sqrtn = (int)Math.sqrt(n);
		boolean isPrime = true;
		for(int i=2; i<sqrtn+1; i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		int n = 0, count=0;
		for(int i=1; true; i+=2) {
			
			if(isPrime(i)) 
				count++;
			if(count==10001) {
				n=i;
				break;
			}	
		}
		System.out.println(n);
	}
}
