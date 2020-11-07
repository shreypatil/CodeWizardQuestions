import java.util.Scanner;
public class Question2 {
	
	static char randomRps() {
		int n = (int)(Math.random()*3);
		if(n==0) 
			return 'r';
		else if(n==1) 
			return 'p';
		else
			return 's';
	}
	
	static int game(char player, char comp) {
		if(player==comp)
			return 0;
		else if(player=='r'&&comp=='s')
			return 1;
		else if(player=='s'&&comp=='p')
			return 1;
		else if(player=='p'&&comp=='r')
			return 1;
		else
			return(-game(comp,player));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wins=0,losses=0;
		for(int i=0; i<3; i++) {
			System.out.print("Enter Your Choice : ");
			char pl = sc.next().charAt(0);
			char comp = randomRps();
			System.out.println("Computer's Choice : "+comp);
			int ifWon = game(pl,comp);
			if(ifWon==1) {
				wins++;
				System.out.println("You Won");
			}
			else if(ifWon==-1) {
				losses++;
				System.out.println("You Lost");
			}
			else
				System.out.println("You Drew");
		}
		System.out.print("After 3 rounds, ");
		if(wins==losses)
			System.out.print("It's a Draw");
		else if(wins<losses) 
			System.out.println("You Lost");
		else
			System.out.println("You Won");
		
	}
}
