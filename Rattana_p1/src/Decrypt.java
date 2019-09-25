import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//DECRYPT
		/* reverse the order of the encrypt
		 * swap the order 3 - 1, 4 - 2 back to 1234
		 */
		//variables
		int n, n1, n2, n3;
				
		//scan
		n = scnr.nextInt();
		
		//seperate integer into variables
		n1 = n % 10;
		n = n / 10;
		n2 = n % 10;
		n = n / 10;
		n3 = n % 10;
		n = n / 10;
		
		n = (n + 7) % 10;
		n1 = (n1 + 7) % 10;
		n2 = (n2 + 7) % 10;
		n3 = (n3 + 7) % 10;
		
		System.out.printf("%d %d %d %d", n2, n3, n, n1);
				
		
	}

}
