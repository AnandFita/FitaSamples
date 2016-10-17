import java.util.Scanner;

public class Staircase {
	/**
	 *  ----#
	 *  ---##
	 *  --###
	 *  -####
	 *  #####
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Steps counts");
		int steps = sc.nextInt();
		for (int i = 0; i < steps; i++) {
			for (int j = 0; j < steps; j++) {
				int k = i+j;
				if(k >= steps-1){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
