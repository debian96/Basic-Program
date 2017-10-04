import java.util.Scanner;

class Perfect {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int sum=0;
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		int temp  =no;
		for (int i = 1; i <= (no/2); i++) {
			if (no%i==0) {
				sum = sum+i;
			}
		}
		if (temp==sum) {
			System.out.println("Perfect");
		}else {
			System.out.println("Not Perfect");
		}
	}
}
