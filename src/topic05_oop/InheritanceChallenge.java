package topic05_oop;

/**
 * Let's build a structural vehicle hierarchy system. Create a program utilizing three classes in your package:
 * 1. Vehicle Class (Parent):
 * 	• Add a protected String brand field. (Using protected allows child classes to access it directly!).
 * 	• Create a constructor to initialize the brand.
 * 	• Add a method public void startEngine() that prints: "The engine of [brand] is starting."
 * 2. Car Class (Child):
 * 	• Extend the Vehicle class.
 * 	• Create a constructor that takes brand and passes it up to the parent using super(brand);.
 * 	• Override the startEngine() method to print: "The [brand] purrs smoothly as the engine starts."
 * 3. InheritanceChallenge Class (main method):
 * 	• Create an instance of the parent Vehicle (e.g., brand "Generic Truck") and call startEngine().
 * 	• Create an instance of the child Car (e.g., brand "Tesla") and call startEngine()
 */
class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void startEngine() {
        System.out.println("The engine of " + this.brand + " is starting.");
    }
}
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    @Override
    public void startEngine() {
        System.out.println("The " + super.brand + " purrs smoothly as the engine starts.");
    }
}
public class InheritanceChallenge {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Truck");
        vehicle.startEngine();

        Car car = new Car("Tesla");
        car.startEngine();
    }
}
