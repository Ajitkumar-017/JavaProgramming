package math;

import java.util.Scanner;

public class Statistics {
    public void mean(int n) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int elem = scan.nextInt();
            arr[i] = elem;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int result = sum / n;
        System.out.println("Mean: " + result);
    }

    public void median(int n) {
        Scanner scan = new Scanner(System.in);
        int median = 0;

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int elem = scan.nextInt();
            arr[i] = elem;
        }
        if (n % 2 != 0) {
            median = arr[n / 2];
            System.out.println("Median: " + median);
        } else {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2;
            System.out.println("Median: " + median);
        }
    }

    public void avg(int n) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int elem = scan.nextInt();
            arr[i] = elem;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int result = sum / n;
        System.out.println("Average: " + result);
    }

    public void stddev(int n) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        double variance = 0.0;
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int elem = scan.nextInt();
            arr[i] = elem;
            sum += arr[i];
        }
        int mean = sum / n;
        for (int i = 0; i < n; i++) {
            variance += Math.pow(arr[i] - mean, 2);
        }
        variance /= n;
        System.out.println("Variance: " + variance);
        double result = Math.sqrt(variance);
        System.out.println("Standard deviation: " + result);
    }
}
