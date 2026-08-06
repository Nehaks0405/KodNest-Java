package track.M02.T01.SD01.P01.M02.T01.SD01.P02;

public class pgm4 {
    public static void main(String[] args){
        int total = 0;
        for(int number =1; number<=5;number++){
            if(number == 3)
                continue;
            System.out.println(number);
            total+=number;
        }
        System.out.println(total);
    }
    
}
