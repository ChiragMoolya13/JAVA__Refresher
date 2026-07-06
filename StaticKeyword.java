public class StaticKeyword{
    public static void main(String[] args) {
        Student s1 = new Student("Chirag", 31, 101);
        Student s2 = new Student("Prayag", 19, 102);

        // Student.college = "SPIT";

        System.out.println(s1.name + " , " + s1.age + ", " + s1.rollNumber + " , " + Student.college);
        System.out.println(s2.name + " , " + s2.age + ", " + s2.rollNumber + " , " + Student.college);
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    static String college;

    Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    //Static Block
    static{
        college = "SPIT";
    }


}