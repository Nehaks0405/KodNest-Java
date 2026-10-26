package Objects;
class OS{
    OS(){
        System.out.println("OS is installed");
    }
    void checkOS(){
        System.out.println("OS is still executing");
    }
}
class Mobile{
    OS o=new OS();
    Mobile(){
        System.out.println("Mobile created with OS");
    }
}
class Main{
    public static void main(String[] args){
        Mobile m;
        m=new Mobile();
        //m=null;
        m.o.checkOS();
    }
}
