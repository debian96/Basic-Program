import java.util.Scanner;

class Gcd {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 2 no:-");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int result = gcd(n1,n2);
		System.out.println(result);
	}
	private static int gcd(int n1, int n2) {
		if (n2==0) {
			return n1;
		}
		else {
			return gcd(n2, n1%n2);
		}
	}
}
