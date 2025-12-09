package Practice;

public class Factorial {
	    int findFactorial(int n) {
	        int fact = 1;
	        for(int i = 1; i <= n; i++) {
	            fact = fact * i;
	        }
	        return fact;
	    }
	    public static void main(String[] args) {

	        Factorial factorial = new Factorial(); 
	        int number = 5;
	        int result = factorial.findFactorial(number);
	        System.out.println("Factorial of " + number + " is: " + result);
	    }
	}
