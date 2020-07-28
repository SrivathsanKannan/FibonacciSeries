package FibonacciSeries;
import java.util.Scanner;

class FibonacciSeries {
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a = 0, b = 1, c;
	    int n;
	    int i;
	    System.out.println("Enter the number of elements to be displayed in the Fibonacci Seriese excluding the first 2");
	    n = s.nextInt();
		System.out.println(a+" ");
		System.out.println(b+" ");
		for(i = 1; i <= n; i++)
		{
		    c = a + b;
		    System.out.println(c+" ");
		    a = b;
		    b = c;
		}
	}
}
