import java.util.Scanner;

/*public class Gcd {
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
}*/

public class Gcd {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 2 no:-");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int l = (n1>n2)?n2:n1;
		
		int gcd = 0;
		for (int i = 1; i <=l; i++) {
			if (n1%i==0 && n2%i==0) {
				gcd = i;
			}
		}
		
		
		System.out.println(gcd);
	}
}