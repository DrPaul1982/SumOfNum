package app;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int line = 0;
        int sum = 0;

        for (int num : nums) {
            line++;
            sum += num;

            System.out.println(line + ") Num is " + num + ", sum is " + sum);
        }

        System.out.println("Sum of numbers is " + sum);

    }

}
