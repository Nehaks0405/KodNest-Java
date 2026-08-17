package track.M02.T01.SD01.P01.M02.Arrays;
import java.util.Scanner;
public class prgm3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }    
}
