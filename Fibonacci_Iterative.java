import java.util.Scanner;

class Fibonacci {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int f1=0, f2=1, f3;
		System.out.println("Enter limit:-");
		int l = sc.nextInt();
		
		System.out.print(f1);
		System.out.print(" ");
		System.out.print(f2);
		System.out.print(" ");
		
		for (int i = 2; i < l; i++) {
			f3 = f1 + f2;
			System.out.print(f3);
			System.out.print(" ");
			f1 = f2;
			f2 = f3;
		}
	}
}

