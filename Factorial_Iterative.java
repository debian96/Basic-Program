import java.util.Scanner;

class Factorial {
	
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

