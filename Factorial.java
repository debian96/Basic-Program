import java.util.Scanner;

public class Factorial {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long f = 1;
		System.out.println("Enter a no:-");
		long no = sc.nextLong();
		while(no>0) {
			f = no * f;
			no--;
		}
		System.out.println(f);
	}
}

/*
 	public class Factorial {
 	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Enter a no:-");
		long no = sc.nextLong();
		long f = factorial(no);
		System.out.println(f);
	}
	
	private static long factorial(long no) {
	
		if (no==0) {
			return 1;
		} else {
			return (no * factorial(no-1));
		}
	}
}
*/