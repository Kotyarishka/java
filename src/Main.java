// ISD-22 Tischenko Danylo
// Sprint 2

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 4, 4, 5, 23, 4, 2, 3 };

        System.out.println("Input array: " + Arrays.toString(array));
        System.out.println("Input value: 2");

        System.out.println("Last index of value: " + lastIndexOf(array, 2));
        System.out.println("All indexes of value: " + Arrays.toString(allIndexesOf(array, 2)));

        int[] sortedArray = {1, 2, 3, 18, 19, 45, 85, 100};

        System.out.println("Is sorted: " + isSorted(sortedArray));
        System.out.println("Is sorted (known false): " + isSorted(array));

        System.out.println("Mode: " + mode(array));

        int[] evenOddArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Even before odd: " + Arrays.toString(evenBeforeOdd(evenOddArray)));

    }

    public static int lastIndexOf(int[] array, int value) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
            }
        }

        return index;
    }

    public static int[] allIndexesOf(int[] array, int value) {
        int[] indexes = new int[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                indexes = Arrays.copyOf(indexes, indexes.length + 1);
                indexes[indexes.length - 1] = i;
            }
        }

        if(indexes.length == 0) return null;

        return indexes;
    }

    public static boolean isSorted(int[] array) {
        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }

    public static int mode(int[] array) {
        if (array.length == 0) return -1;
        if (array.length == 1) return array[0];

        int[] frequency = new int[101];

        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 0 && array[i] <= 100) {
                frequency[array[i]]++;
            }
        }

        int mostFrequent = 0;

        for (int i = 0; i < frequency.length; i++) {
            int newFreq = frequency[i];
            int oldFreq = frequency[mostFrequent];

            if(newFreq > oldFreq) {
                mostFrequent = i;
                continue;
            }

            if(newFreq == oldFreq) {
                mostFrequent = Math.min(mostFrequent, i);
            }
        }

        return mostFrequent;
    }

    public static int[] evenBeforeOdd(int[] array) {
        int evenIndex = 0;
        int oddIndex = array.length - 1;

        for (; evenIndex < oddIndex; evenIndex++) {
            if(array[evenIndex] % 2 == 1) {
                for (; oddIndex > evenIndex; oddIndex--) {
                    if(array[oddIndex] % 2 == 0) {
                        int temp = array[evenIndex];
                        array[evenIndex] = array[oddIndex];
                        array[oddIndex] = temp;
                        break;
                    }
                }
            }
        }

        return array;
    }
}