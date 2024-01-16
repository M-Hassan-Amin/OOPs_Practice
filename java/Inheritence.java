// Base class (superclass)
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Derived class 1 (subclass)
class Car extends Vehicle {
    int numOfDoors;

    public Car(String brand, int year, int numOfDoors) {
        super(brand, year);
        this.numOfDoors = numOfDoors;
    }

    public void displayCarInfo() {
        displayInfo(); // Accessing the method from the superclass
        System.out.println("Number of Doors: " + numOfDoors);
    }
}

// // Derived class 2 (subclass)
class Bicycle extends Vehicle {
    int numOfGears;

    public Bicycle(String brand, int year, int numOfGears) {
        super(brand, year);
        this.numOfGears = numOfGears;
    }

    public void displayBicycleInfo() {
        displayInfo(); // Accessing the method from the superclass
        System.out.println("Number of Gears: " + numOfGears);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        Bicycle myBicycle = new Bicycle("Giant", 2022, 6);

        // Displaying information using subclass methods
        System.out.println("Car Information:");
        myCar.displayCarInfo();
        System.out.println("Use Parent Class function..............!");
        myCar.displayInfo();

        System.out.println("\nBicycle Information:");
        myBicycle.displayBicycleInfo();
        System.out.println("Use Parent Class function..............!");
        myBicycle.displayInfo();
    }
}
