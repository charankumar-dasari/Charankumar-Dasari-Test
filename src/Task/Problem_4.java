package Task;

import java.util.*;

public class Problem_4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        for (int j = 1; j <= 9; j++) {
            countMap.put(j, 0);
        }

        System.out.println("The Multiple Counts are : ");
        for (int num : arr) {
            for (int j = 1; j <= 9; j++) {
                if (num % j == 0) {
                    countMap.put(j, countMap.get(j) + 1);
                }
            }
        }
        System.out.println(countMap);

	}

}
