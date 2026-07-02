public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        Student s2 = new Student("Prayag", 19, 101, "Praveen");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNumber);
        System.out.println(s2.college);
        
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(){
        // name = "Chirag";
        // age = 31;
        // rollNumber = 101;
        // college = "SPIT";
    }

    Student(String name, int age, int rollNumber, String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    void markAttendance(){
        System.out.println("Attendance marked by " + name);
    }

    void print(){
        System.out.println(name + " . " + age + " . " + rollNumber + " . " + college);
    }
}