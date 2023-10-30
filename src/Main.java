// ISD-22 Tischenko Danylo
// Sprint 2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: (intersect)");
        int[] arr1 = {1, 4, 8, 9, 11, 15, 17, 28, 41, 59};
        int[] arr2 = {4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));

        System.out.println("\nTask 2: (reverse)");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        reverse(list);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("apple", "bananas", "orange", "kiwis", "strawberry"));

        System.out.println("\nTask 3: (capitalizePlurals)");
        capitalizePlurals(list2);
        System.out.println(list2);

        System.out.println("\nTask 4: (removePlurals)");
        removePlurals(list2);
        System.out.println(list2);

        System.out.println("\nTask 5: (readFile)");
        readFile("src/numbers.txt");
    }

    public static int[] intersect(int[] list1, int[] list2) {
        int[] result = new int[0];
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++)
                if (list1[i] == list2[j]) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = list1[i];
                }
        }
        return result;
    }

    public static void reverse(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }

    public static void capitalizePlurals(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).endsWith("s")) {
                String item = list.get(i);
                String firstLetter = item.substring(0, 1).toUpperCase();

                list.set(i, firstLetter + item.substring(1));
            }
        }
    }

    public static void removePlurals(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).endsWith("s")) {
                list.remove(i);
            }
        }
    }

    // Напишіть програму, яка читає файл, заповнений цілими числами, і відображає
    //всі числа у вигляді списку в консоль, а потім:
    //- Виводить середнє всіх чисел з списку.
    //- Виводить найбільше та найменше число з списку.
    //- Виводить всі парні числа з списку.

    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
            System.out.print("Numbers: ");
            System.out.println(list);
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println("Average: " + sum / list.size());
            int max = list.get(0);
            int min = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max)
                    max = list.get(i);
                if (list.get(i) < min)
                    min = list.get(i);
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

            System.out.print("Even numbers: ");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0)
                    System.out.print(list.get(i) + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}