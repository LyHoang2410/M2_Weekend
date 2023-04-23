package HomeWork_22_23_4;

import java.util.*;

public class SortAndFindIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to create the array: ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arrays = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter element #" + (i + 1) + ": ");
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] indexArr = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++){
            indexArr[i] = i;
        }
        int[] newArrays = Arrays.copyOf(arrays, arrays.length);
        Arrays.sort(newArrays);
        System.out.println("The array after sorting is: ");
        for(int i = 0; i < newArrays.length; i++){
            System.out.println(newArrays[i] + " ");
        }
        System.out.println();

        System.out.println("The initial position of the elements is: ");
        for(int i = 0; i < newArrays.length; i++){
            int index = indexArr[Arrays.binarySearch(newArrays, arrays[i])];
            System.out.println(index + " ");
        }
        System.out.println();
    }
}

