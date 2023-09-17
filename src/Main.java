// ISD-22 Tischenko Danylo
// Sprint 1

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter min: ");
        int min = console.nextInt();
        System.out.print("Enter max: ");
        int max = console.nextInt();

        if (min > max) {
            System.out.println("Min is greater than max");
            return;
        }

        int[] array = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = min + i;
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Count: " + array.length);

        int[] oddArray = new int[array.length];
        int oddCount = 0;
        int[] evenArray = new int[array.length];
        int evenCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[oddCount] = array[i];
                oddCount++;
            } else {
                evenArray[evenCount] = array[i];
                evenCount++;
            }
        }

        System.out.println("Odd array: " + Arrays.toString(oddArray));
        System.out.println("Odd count: " + oddCount);

        System.out.println("Even array: " + Arrays.toString(evenArray));
        System.out.println("Even count: " + evenCount);

        int[] negativeArray = new int[array.length];
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArray[negativeCount] = array[i];
                negativeCount++;
            }
        }

        if (negativeCount > 0) {
            System.out.println("Negative array: " + Arrays.toString(negativeArray));
            System.out.println("Negative count: " + negativeCount);
        } else {
            System.out.println("Negative array is empty");
        }

        int[] positiveArray = new int[array.length];
        int positiveCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveArray[positiveCount] = array[i];
                positiveCount++;
            }
        }

        if (positiveCount > 0) {
            System.out.println("Positive array: " + Arrays.toString(positiveArray));
            System.out.println("Positive count: " + positiveCount);
        } else {
            System.out.println("Positive array is empty");
        }
    }
}