public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount{
    private double balance;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    //getter / setters
    public double getBalance(){
        return balance;
    }

}

class Student{
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    public Student(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.college = college;
    }

    //getters ans setters
    public void getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void getCollege(){
        return college;
    }
    public void setCollege(String college){
        //Validation ---> college should be real.
        this.college = college;
    }

    
}
