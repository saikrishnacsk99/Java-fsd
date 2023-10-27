package oops;
class Vehicle
{
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo()
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle
{
    int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void displayCarInfo()
    {
        displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}
public class Inheritance 
{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, 4);

        car1.displayInfo();

        System.out.println(); 
        car1.displayCarInfo();
    }
	

}
