package even;

import java.util.Scanner;

public class searchelemen {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 9, 3, 7 };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element is present in the array.");
        } else {
            System.out.println("Element is NOT present in the array.");
        }
    }
}
