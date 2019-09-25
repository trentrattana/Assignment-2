import java.util.Scanner;

public class Rattana_p1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//ENCRYPTS
		/* read a 4 digit integer
		 * replace each digit with result of adding 7 to digits
		 * getting the remainder by dividing new value by 10
		 * swap first digit with third
		 * swap second with fourth
		 * print integer
		 * reverse to original number
		 */
		
		//variables
		int n, n1, n2, n3;
		
		//scan
		n = scnr.nextInt();
		
	
		//add 7
		n = n + 7;
		n1 = n1 + 7;
		n2 = n2 + 7;
		n3 = n3 + 7;
		
		//get the remainder after dividing by 10
		n = n % 10;
		n1 = n1 % 10;
		n2 = n2 % 10;
		n3 = n3 % 10;
		
		//swap the location of variables then print
		System.out.printf("%d %d %d %d", n2, n3, n, n1);
			
		
		

	}

}
