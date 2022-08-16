package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
    Array numbers = new Array(new int[]{7, 9, 5, 3, 8});
    System.out.println("Your array:");
    numbers.Show();

    System.out.println("Max value in array: " + numbers.Max());
    System.out.println("Minimum value in array: " + numbers.Min());
    System.out.println("Average value of the array: " + numbers.AVG());

    System.out.println("The array is sorted in ascending order:");
    numbers.SortAsc();
    numbers.Show();

    System.out.println("The array is sorted in descending order:");
    numbers.SortDesc();
    numbers.Show();
    }
}