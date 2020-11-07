import java.util.*;
public class Question1 {
	// Duck and Chick DNA
	
	static char d_t_r(char c) {
		char r;
		switch(c) {
		case 'G':
			r = 'C';
			break;
		case 'C':
			r = 'G';
			break;
		case 'T':
			r = 'A';
			break;
		case 'A':
			r = 'U';
			break;
		default :
			r = '?';
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dna = sc.next().toUpperCase();
		int len = dna.length();
		boolean flag = false;
		StringBuilder rna = new StringBuilder(); 
		for(int i=0; i<len; i++) {
			char ctemp = d_t_r(dna.charAt(i));
			if(ctemp=='?') {
				flag = true;
				break;
			}
			rna.append(ctemp);
		}
		if(flag) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println(rna);
		}
	}

}
