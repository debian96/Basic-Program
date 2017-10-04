import java.util.Scanner;

public class Armstrong {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		int temp  =no;
		int sum  = 0,rem;
		while(no>0) {
			rem = no%10;
			sum = sum+(rem*rem*rem);
			no = no/10;
		}
		if (temp == sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}
}
