import java.util.Scanner;
//Strong number is a special number whose sum of factorial of digits is equal to the original number.
public class Strong {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int sum=0, rem;
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		int temp  =no;
		while(no>0) {
			rem = no%10;
			sum = sum+fact(rem);
			no = no/10;
		}
		if (temp==sum) {
			System.out.println("Strong");
		}else {
			System.out.println("Not Strong");
		}
	}
	private static int fact(int no) {
		if (no==0) {
			return 1;
		} else {
			return (no * fact(no-1));
		}
	}
}
