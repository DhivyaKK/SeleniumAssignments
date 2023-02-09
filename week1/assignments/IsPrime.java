package week1.assignments;

public class IsPrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12;
		boolean isPrimeNo = true;
		
		/*to check if the number is prime 
		 * A number is prime if it can be divided by 1 and itself. 
		 * If any other number can divide the number, then it is not a prime
		 * 
		 * */
		 
		for(int i=2; i <= num-1; i++)
		{
			if(num % i == 0)
			{
				isPrimeNo = false;
				break;
			}
		}
		
		if(isPrimeNo)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
		}
		
	}
}
