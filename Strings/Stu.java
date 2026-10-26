public class Stu {
    public static void main(String[] args){
        Student s1=new Student(11,"Arjun");
        Student s2=new Student(12,"Raju");
        Student s3=new Student(11,"Arjun");
        Object s4=new Student(22,"Ravi");
        System.out.println(s1.getClass());
        System.out.println(s4.getClass());
    }
    
}
