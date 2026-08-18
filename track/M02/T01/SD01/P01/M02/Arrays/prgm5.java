package track.M02.T01.SD01.P01.M02.Arrays;
import java.util.Scanner;
public class prgm5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the elements:");
        for (int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Array Elements are:");
        for (int i=0;i<=a.length-1;i++){
            System.out.println(a[i]+" ");
        }
        int sum=0;
        for (int i=0; i<=a.length-1; i++){
            sum=sum+a[i];
        }
        System.out.println();
        System.out.println("Total: "+sum);
    }
    
}
