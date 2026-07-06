public class Inheritance {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();  
    }
}

class Student{
    String name;
    int age;
    void markAttendance(){
        System.out.println("Attendance Marked");
    }
}

class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("lab attended");
    }
}
