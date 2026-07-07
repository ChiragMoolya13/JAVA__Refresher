public class Polymorphism {
    public static void main(String[] args) {
        A a = new B();
        // a.fun();
        System.out.println(a.getX());
    }
}


//Static ---> they belong to class and not to objects
//private methods cant be overriden
// final methods cannot be overriden 

// Final ----> class??? ---> you cannot create child of that class(that means you cant inherit this class)

// Fields / Varables they cannot be polymorphic
// class A{
//     static void fun(){
//         System.out.println("Fun");
//     }
    
//     private void fun2(){
//         System.out.println("Fun");
//     }
    
//     final void fun3(){   // you cant override the final method
//         System.out.println("Fun");
//     }
// }

// class B extends A{
//     static void fun() {
//         System.out.println("Fun from B");
//     }


// }

class A{
    //int x = 10;

    int getX(){
        return 10;
    }
}

class B extends A {
    //int x = 20;

    int getx(){
        return 20;
    }
}