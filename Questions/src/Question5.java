public class Question5 {
	static boolean isPalindrome(int n) {
		int num = n, rev =0;
		while(num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
		if(n==rev)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int max=0, maxby99 = 0;
		for(int i=999; i>1; i--) {
			if(i<maxby99) {
				break;
			}
			for(int j=i; j>i-10; j--) {
				int ij = i*j;
				if(isPalindrome(ij)&&ij>max) {
					max=ij;
					maxby99=max/999;
				}
			}
		}
		System.out.println(max);
	}
}
