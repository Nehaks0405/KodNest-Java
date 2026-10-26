package Objects;

public class Pgm1 {
    final void display1(){
        System.out.println("Inside Pgm1 disp1");
    }
    void display2(){
        System.out.println("Inside Pgm1 disp2");
    }
    
}
class Pgm2 extends Pgm1{
    @Override void display1(){
        System.out.println("Child disp1");
    }
    @Override void display2(){
        System.out.println("Child disp2");
    }
}
class Main1{
    public static void main(String[] args){
        Pgm2 p2=new Pgm2();
        p2.display1();
        p2.display2();
    }
}
