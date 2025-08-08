package start.build.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

   
        System.out.println("\nArray elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

      
        System.out.print("\n\nEnter element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(search + " is present in the array.");
        } else {
            System.out.println(search + " is NOT present in the array.");
        }

        // Step 4: Find maximum and minimum
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

      
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

       
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
}
