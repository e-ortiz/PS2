package MainPackage;

public class MyInteger {

	// integer value
	private static int value;
	
	private MyInteger(int value){
		MyInteger.value = value;
	}
		
	private int getValue() {
		return MyInteger.value;
	}

	private void setValue(int value) {
		MyInteger.value = value; 
	}


	// isEven(), isOdd(), isPrime()  

	private boolean isEven() {
		if ((MyInteger.value % 2) == 0)
			return true;
		else
			return false;
	}

	private boolean isOdd() {
		if ((MyInteger.value % 2) == 1)
			return true;
		else
			return false;
	}

	private boolean isPrime() {
		for (int x = 2; x < MyInteger.value; x++) { // x will never include 1 or n, conditions for prime numbers
			if (MyInteger.value % x == 0)           // if n ever divides evenly by x (where n is [2, x)) 
				return false;         // then it returns false, not a prime
		}
		return true;                  // if the for loop never divides evenly, then the number is Prime
	}

	// isEven(Int), isOdd(Int), isPrime(Int)
	public static boolean isEven(int value){
		if ((value % 2) == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int value) {
		if ((value % 2) == 1)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int value) {
		for (int x = 2; x < value; x++) { 
			if (value % x == 0)           
				return false;         
		}
		return true;             
	}
	
	// isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) 
	public static boolean isEven (MyInteger num){
		
		if ((num.getValue() % 2) == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger num) {
		if ((num.getValue() % 2) == 1)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger num) {
		for (int x = 2; x < num.getValue(); x++) { 
			if (num.getValue() % x == 0)           
				return false;         
		}
		return true;             
	}
	
	// equals(int) equals(MyInteger) 
	public static boolean equals(int n){
		if (n == value)
			return true;
		else 
			return false; 
		}
	
	public static boolean equals(MyInteger n){
		if (n.getValue() == value)
			return true;
		else 
			return false; 
		}
	
	// parseInt(char[])
	public static int parseInt(int[] n){
		int x = 0;
		for (int i = 0; i < n.length; i++){
			x += n[i];
		}
		return x;
				
	}
	
	//parseInt(String)
	public static int parseInt(String s){
		int integer = s.length();
		return integer; 
	}
	
	
	
	public static void main(String[] args) {
		int[] parseintegers = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(parseInt("HelloWorld") + " " + parseInt(parseintegers) 
				+ " " + isEven(7) + " " + isOdd (7) + " " + isPrime(7));
	}
	
}


