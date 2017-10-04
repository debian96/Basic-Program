import java.util.Scanner;

class Reverse {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int rem, res=0;
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		int temp  =no;
		while(no>0) {
			rem = no%10;
			res = (res*10)+rem;
			no = no/10;
		}
		System.out.println(res);
	}
}
