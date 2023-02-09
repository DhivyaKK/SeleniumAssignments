package week1.assignments;

/*Fibonacci series is such that
 * In a fibonacci series, num 3 = num 2+ num 1
 * 0 1 1 2 3 5 8 13 21
 * 
 * Generate a fibonacci series for first 11 numbers
 * */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println("The fibonacci series from 1 through 11 is " + "\n");
		System.out.print(num1);
		System.out.print("\t" + num2);
		
		for(int i=1; i<=11; i++) {
			
			sum = num1+ num2;
			System.out.print("\t" + sum);
			num1 = num2;
			num2 =sum;
			
			
			
		}
				
	}

}

