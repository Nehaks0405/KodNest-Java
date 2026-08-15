package track.M02.T01.SD01.P01.ObjectOriented;

class Student {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 14;
        s1.name = "Neha";
        s1.height = 5.1;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.run();
        s1.sleep();
    }
}

