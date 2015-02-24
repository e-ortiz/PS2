package MainPackage;

public class MyInteger {

	// integer value
	public int integer;

	// Getters and Setters
	public int getInteger() {
		return integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}

	// isEven(), isOdd(), isPrime()  

	public static boolean isEven(int n) {
		if ((n % 2) == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int n) {
		if ((n % 2) == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int n) {
		for (int x = 2; x < n; x++) { // x will never include 1 or n, conditions for prime numbers
			if (n % x == 0)           // if n ever divides evenly by x (where n is [2, x)) 
				return false;         // then it returns false, not a prime
		}
		return true;                  // if the for loop never divides evenly, then the number is Prime
	}

	
	
	
	
	public static void main(String[] args) {
		System.out.println(isPrime(11) + " " + isPrime(14));
	}
}
