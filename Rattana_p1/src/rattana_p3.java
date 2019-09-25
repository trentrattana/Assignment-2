import java.util.Scanner;

public class rattana_p3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		/*
		 *  create a 2 arrays, 1 for category, one for responses
		 *  rows have 5 topics
		 *  columns have 10 ratings
		 *  users multiple inputs
		 *  on the right show the average
		 *  highest point total, show both issue and point total
		 *  lowest ^
		 */
		
		String[] pizza = {"toppings", "cheese", "crust", "sauce", "size"};
		int[][] response = new int[5][10];
		int[] sum = new int[] {0,0,0,0,0};
		
		//amount of people taking the poll
		System.out.println("How many are taking the poll?");
		int people = scnr.nextInt();
		
		//Question
		System.out.println("How important are these features on a pizza?");
		
		//loops for all the people
		for(int i = 0; i < people; i++) {
			//loops for topics
			for(int j = 0; j < 5; j++) {
				System.out.println(pizza[j]);
				response[i][j] = scnr.nextInt();
				int sum[i] += response[i][j];
			}
			if (i < people) {
				System.out.println("Next!");
			}
		}
		
		//average
		int avg = 0;
		avg = sum[i] / people;
		System.out.println("Average: " + avg);
		
		//highs and lows
		int high, low;
		int highPoint, lowPoint;
		
		for (int i = 0; i = people; i++) {
			if(high < sum[i]) {
				high = sum[i];
				highPoint = i;
			}
			if(low > sum[i]) {
				low = sum[0];
				lowPoint = i;
			}
		System.out.println("Highest point feature is " + pizza[highPoint] + "and has " + high + " points");
		System.out.println("Lowest point feature is " + pizza[lowPoint] + "and has " + low + " points");
		}
	
	}
}

	
	
	


