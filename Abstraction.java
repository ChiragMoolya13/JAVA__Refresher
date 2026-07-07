public class Abstraction {
    public static void main(String[] args){
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}

abstract class Car{
    void start(){
        System.out.println("Car Started");
    }
    
    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car{

    @Override
    void accelerate(){
        System.out.println("Fuel car is accelerating");
    }
    
    @Override
    void brake(){
        System.out.println("Fuel car is Stopping"); 
    }
    
}

class ElectricCar extends Car{
    
    @Override
    void accelerate(){
        System.out.println("ElectricCar car is accelerating");
        
    }
    
    @Override
    void brake(){
        System.out.println("ElectricCar car is Stopping");
        
    }

}
