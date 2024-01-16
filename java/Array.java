import java.util.ArrayList;

public class Array {
    // public static void main(String[] args) {
    // // String x = "Altaf";
    // String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "BMW" };
    // int[] myNum = { 10, 20, 30, 40 };
    // System.out.println("Value in 0 Indexing :- " + cars[4]);
    // System.out.println("Array is :- " + myNum[4]);

    // }

    public static void main(String[] args) {
    // Declaring and initializing an array of integers
    int[] numbers = { 1, 2, 3, 4, 5 };

    // Accessing elements of the array
    System.out.println("First element: " + numbers[0]);
    System.out.println("Third element: " + numbers[2]);

    // Modifying elements of the array
    numbers[1] = 10;
    System.out.println("Modified second element: " + numbers[1]);

    // Finding the length of the array
    System.out.println("Length of the array: " + numbers.length);

    // Two Dimensional Array..

    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}, {12,17,15,16} };
    System.out.println("Two Dimension Array...... --> " + (myNumbers[2][2]+myNumbers[0][3]));

    }

    // public static void main(String[] args) {
    //     ArrayList<Integer> list1 = new ArrayList<Integer>();
    //     list1.add(5);
    //     System.out.println("First element: " + list1.get(0));

    // }

}


// import java.util.Arrays;

// public class Array {
//     public static void main(String[] args) {
//         Integer[] arr = {0, 5, 6, 7, 8};

//         System.out.println("\nWithout Append Before Convert the array to an ArrayList:- "+Arrays.toString(arr));
        
//         // Array to ArrayList
//         System.out.println("\n**************** Convert Array to Array List ArrayList<>(Arrays.asList(arr))*****************");
//         java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>(Arrays.asList(arr));
//         System.out.println("Without Append After Convert the array to an ArrayList :- "+arrayList);
        
//         // Append.......

//         System.out.println("\n************************ Append List add()**********************");
//         arrayList.add(9);
//         arrayList.add(10);
//         System.out.println("With Append After Convert the array to an ArrayList:- "+arrayList);

//         // ArrayList back to an array
//         System.out.println("\n****************** Convert Array List to Array. arrayList.toArray(new Integer[0])*******************");
//         arr = arrayList.toArray(new Integer[0]);
        
//         // Print the array
//         System.out.println("With Append Before Convert the arrayList to an Array:- "+Arrays.toString(arr) + "\n");

//         // Indexing with ArrayList Using get()
//         // System.out.println(arrayList.get(1));

//     }
// }