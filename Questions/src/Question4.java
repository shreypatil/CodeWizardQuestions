import java.util.*;
public class Question4 {
	
	static boolean isLeap(int y) {
		if (((y% 4 == 0)&&(y%100!=0))||(y%4==0)) 
			return(true);
		else
			return(false);
	}
	
	static int getDay(int dd,int mm) {
		Map<Integer, Integer> months = new HashMap<Integer, Integer>();
		months.put(1, 31);
		months.put(2, 28);
		months.put(3, 31);
		months.put(4, 30);
		months.put(5, 31);
		months.put(6, 30);
		months.put(7, 31);
		months.put(8, 31);
		months.put(9, 30);
		months.put(10, 31);
		months.put(11, 30);
		months.put(12, 31);
		if(mm==1) 
			return dd;
		else
			return getDay(dd,mm-1)+months.get(mm-1);
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dd : ");
		int dd=sc.nextInt();
		System.out.print("Enter mm : ");
		int mm=sc.nextInt();
		System.out.print("Enter yyyy : ");
		int yyyy=sc.nextInt();
		int day = getDay(dd,mm);
		if(isLeap(yyyy)&&(day>59)) 
			day++;
		System.out.println("Day of Year : "+day);
	}
}
