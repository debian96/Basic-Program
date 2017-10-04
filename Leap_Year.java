import java.util.Scanner;

class Leap_Year {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter Year:-");
		long y = sc.nextLong();
		
		if (y%4==0) {
			if (y%100==0) {
				if (y%400==0) {
					System.out.println("Leap Year");
				} else {
					System.out.println("Not Leap Year");
				}
			} else {
				System.out.println("Leap Year");
			}
		} else {
			System.out.println("Not Leap Year");
		}
	}
}
