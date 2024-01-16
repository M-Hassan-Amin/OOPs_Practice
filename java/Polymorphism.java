// // Runtime Polymorphism (Method Overriding):

class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }

    int add(int a, int b) {
        return a + b;
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        Animal Rk = new Animal(); // Runtime polymorphism
        myAnimal.makeSound();
        System.out.println(myAnimal.add(25, 15));
        Rk.makeSound(); // Calls the overridden method in Dog
    }
}

// Compile-time Polymorphism (Method Overloading):

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        int resultInt = math.add(5, 10); // Compile-time polymorphism
        double resultDouble = math.add(5.5, 10.5);
        String str = math.add("Hassan ", "Don");
        System.out.println(resultInt); // Compile-time polymorphism
        System.out.println(resultDouble);
        System.out.println(str);
    }
}
