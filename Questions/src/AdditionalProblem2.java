import java.util.*;
public class AdditionalProblem2 {
	
	static void makeMove(char c) {
		switch(c) {
		case 'n':
			coordinates[1]++;
			break;
		case 's':
			coordinates[1]--;
			break;
		case 'e':
			coordinates[0]++;
			break;
		case 'w':
			coordinates[0]--;
			break;	
		}
	}
	
	static int[] coordinates = {0,0};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("Enter direction to move in : ");
			char c = sc.next().charAt(0);
			makeMove(c);
		}
		int n = Math.abs(coordinates[0])+Math.abs(coordinates[1]);
		if(n==0) 
			System.out.println("Travelling Wasted");
		else
			System.out.println("Minimum number of moves required to get to this position : "+n);
	}

}
