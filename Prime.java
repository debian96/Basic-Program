import java.util.Scanner;

public class Prime {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int flag=0;
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		for (int i = 2; i <= no/2; i++) {
			if (no%i==0) {
				flag = 1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
