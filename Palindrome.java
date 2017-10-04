import java.util.Scanner;

public class Palindrome {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		int reverse = reverse(no);
		if (no==reverse) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	private static int reverse(int no) {
		int rem, res=0;
		while(no>0) {
			rem = no%10;
			res = (res*10)+rem;
			no = no/10;
		}
		return res;
	}
}
