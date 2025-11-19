package Task;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int odd = (2 * i) - 1;
            System.out.print(odd);

            if (i < a) 
            	System.out.print(", ");

	    }

	}
}
