// // Person's Class 
// public class Class_Object {
//     // Class variables
//     int x = 45;
//     String name;
//     int age;

//     // Main method
//     public static void main(String[] args) {
//         // Creating objects
//         Class_Object person1 = new Class_Object();
//         Class_Object person2 = new Class_Object();
//         System.out.println("Person 1: " + person1.x);
//         System.out.println("Person 2: " + person2.x);

//         System.out.println("/n *********************** /n");
//         // Assigning values to object properties
//         person1.name = "Alice";
//         person1.age = 25;

//         person2.name = "Bob";
//         person2.age = 30;

//         // Displaying object properties
//         System.out.println("Person 1: " + person1.name + ", Age: " + person1.age);
//         System.out.println("Person 2: " + person2.name + ", Age: " + person2.age);
//     }
// }

// public class Class_Object {
//     int x = 5;
  
//     public static void main(String[] args) {
//       Class_Object myObj1 = new Class_Object();
//       Class_Object myObj2 = new Class_Object();
//             Class_Object myObj3 = new Class_Object();

//       myObj2.x = 25;
//       System.out.println("Leaves of object 1: " + myObj1.x);
//       System.out.println("Leaves of object 2: " + myObj2.x);
//             System.out.println("Leaves of object 3: " + myObj3.x);

//     }
//   }

// public class Class_Object {
//   // Static method
//   static void myStaticMethod() {
//     System.out.println("Static methods can be called without creating objects");
//   }

//   // Public method
//   public void myPublicMethod() {
//     System.out.println("Public methods must be called by creating objects");
//   }

//   // Main method
//   public static void main(String[] args) {
//     myStaticMethod(); // Call the static method
//     // myPublicMethod(); // This would compile an error
//         System.out.println("--------------------------------------------\n");


//     Class_Object myObj = new Class_Object(); // Create an object of Main
//     myObj.myPublicMethod(); // Call the public method on the object
//     System.out.println("--------------------------------------------");
//     myObj.myPublicMethod();
//   }
// }

public class Class_Object {
    // Attribute
    int x;

    // Constructor
    public Class_Object(int initialValue) {
        x = initialValue;
    }

    // Method
    public void display() {
        System.out.println("The value of x is: " + x);
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        Class_Object myObject = new Class_Object(25);

        // Accessing the attribute and calling the method
        myObject.display();
    }
}

