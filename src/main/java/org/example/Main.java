package org.example;

public class Main {
    public static double arrayAvg(int[] numbers) {
        double sum = 0;

        // Uncomment the next line to introduce a null pointer exception
        // numbers = null;

        try {
            for (int number : numbers) {
                sum += number;
            }
        } catch (NullPointerException e) {
            System.out.println("List is empty, Null pointer");
            return 0; // Return 0 or handle appropriately
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        // Uncomment the next line to introduce a logic error
        // return sum / (numbers.length + 1);

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // Test with an array of numbers 1, 2, 3, 4, 5
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(arrayAvg(numbers)); // Expected output: 3.0

        // Uncomment the next line to introduce an array index out of bounds exception
        // int test = numbers[10];
    }
}
