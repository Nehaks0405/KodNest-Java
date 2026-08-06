package track.M02.T01.SD01.P01.M02.T01.SD01.P02;

public class pgm5 {

    public static void main(String[]args){
        int marks=68;
        int attendance=80;
        int practiceDays=3;
        String status=(marks >=60 && attendance >=75)?"Placement Ready":"Continue Preparation";
        System.out.println(status);
        for (int i=1;i <=practiceDays; i++){
            System.out.println("Practice Day: " +i);
        }
    }
    
}
