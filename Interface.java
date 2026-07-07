public class Interface {
    public static void main(String[] args) {
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}

interface Car{
    void start();

    void accelerate();
    void brake();
}

class FuelCar implements Car{

    @Override
    public void start(){
        System.out.println("Fuel car is Starting");
    }

    @Override
    public void accelerate(){
        System.out.println("Fuel car is accelerating");
    }
    
    @Override
    public void brake(){
        System.out.println("Fuel car is Stopping"); 
    }
    
}

class ElectricCar implements  Car{

     @Override
    public void start(){
        System.out.println("ElectricCar car is Starting");
    }
    
    @Override
    public void accelerate(){
        System.out.println("ElectricCar car is accelerating");
        
    }
    
    @Override
    public void brake(){
        System.out.println("ElectricCar car is Stopping");
        
    }

}