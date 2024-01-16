// // Superclass
// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// // Subclass inheriting from Animal
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// // Main class for testing
// public class types_inheritence {
//     public static void main(String[] args) {
//         // Creating an object of the subclass
//         Dog myDog = new Dog();
//         Animal myanimal = new Animal();

//         // Accessing methods from both superclass and subclass
//         myDog.eat();  // Accessing method from the Animal class
//         myDog.bark();
//         myanimal.eat(); // Accessing method from the Dog class
//     }
// }


// MultilevelInheritanceExample
// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// // Intermediate class inheriting from Animal
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// // Subclass inheriting from Dog
// class Labrador extends Dog {
//     void swim() {
//         System.out.println("Labrador is swimming");
//     }
// }

// // Main class for testing
// public class types_inheritence {
//     public static void main(String[] args) {
//         // Creating an object of the subclass
//         Labrador myLabrador = new Labrador();

//         // Accessing methods from all three classes
//         myLabrador.eat();   // Accessing method from the Animal class
//         myLabrador.bark();  // Accessing method from the Dog class
//         myLabrador.swim();  // Accessing method from the Labrador class
//     }
// }

// HierarchicalInheritanceExample
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class 1
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle");
    }
}

// Derived class 2
class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }
}

// Derived class 3
class Triangle extends Shape {
    void drawTriangle() {
        System.out.println("Drawing a triangle");
    }
}

// Main class for testing
public class types_inheritence {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        // Accessing methods from the base class
        circle.draw();      // Drawing a shape
        rectangle.draw();   // Drawing a shape
        triangle.draw();    // Drawing a shape

        // Accessing methods specific to each derived class
        circle.drawCircle();      // Drawing a circle
        rectangle.drawRectangle(); // Drawing a rectangle
        triangle.drawTriangle();   // Drawing a triangle
    }
}
