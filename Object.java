public class Object{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Chirag";
        s1.age = 31;
        s1.rollNumber = 101;
        s1.college = "SPIT";

        s2.name = "Prayag";
        s2.age = 19;
        s2.rollNumber = 102;
        s2.college = "SPIT";

        s1.markAttendance();
        s2.markAttendance();
        s1.print();
        s2.print();
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked by " + name);
    }

    void print(){
        System.out.println(name + " . " + age + " . " + rollNumber + " . " + college);
    }
}

//Java is almost complete Object oriented programming