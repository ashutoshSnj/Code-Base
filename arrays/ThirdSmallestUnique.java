package start.build.arrays;

public class ThirdSmallestUnique {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 2, 8, 1, 1, 3};

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;

        for (int num : arr) {
           
            if (num == firstMin || num == secondMin || num == thirdMin) {
                continue;
            }

            if (num < firstMin) {
                thirdMin = secondMin;
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin) {
                thirdMin = secondMin;
                secondMin = num;
            } else if (num < thirdMin) {
                thirdMin = num;
            }
        }

        if (thirdMin == Integer.MAX_VALUE) {
            System.out.println("There is no third smallest unique number.");
        } else {
            System.out.println("Third smallest unique number is: " + thirdMin);
        }
    }
}
