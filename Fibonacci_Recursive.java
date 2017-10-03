public class Fibonacci {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int f1=0, f2=1, f3;
		System.out.println("Enter limit:-");
		int l = sc.nextInt();
		
		System.out.print(f1);
		System.out.print(" ");
		System.out.print(f2);
		System.out.print(" ");
		
		fibonacci(l-2,f1,f2);
	
	}

	private static void fibonacci(int l,int f1,int f2) {
		if (l>0) {
			
			int f3 = f1+f2;
			System.out.print(f3);
			System.out.print(" ");
		
			fibonacci(l-1,f2,f3);
		}
		
		
	}
}
