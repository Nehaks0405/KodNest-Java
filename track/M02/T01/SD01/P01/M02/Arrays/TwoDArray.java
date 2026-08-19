package track.M02.T01.SD01.P01.M02.Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] a = new int[3][5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Elements are:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
