package track.M02.T01.SD01.P01.M02.T01.SD01.P02;
import java.util.Scanner;
public class pgm6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        int solvedProblems=sc.nextInt();
        double assessmentPercentage=sc.nextDouble();
        System.out.println("Learner:"+firstName);
        System.out.println("Problems solved:"+solvedProblems);
        System.out.println("Assessment:"+assessmentPercentage);
        sc.close();
    }
    
}
