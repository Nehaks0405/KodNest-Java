package track.M02.T01.SD01.P01.M02.Arrays;
import java.util.Scanner;
public class ThreeDArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[][][]=new int[3][3][5];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
