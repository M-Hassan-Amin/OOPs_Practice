// public class forloop {
//     public static void main(String[] args) {
//         // Printing numbers from 1 to 5
//         for (int i = 12; i >= 12; i=i+2) {
//             System.out.println("Number: " + i);
//         }
//     }
// }


public class forloop {
    public static void main(String[] args) {
        // An array of integers
        int[] numbers = {1, 2, 13, 4, 5};

        // Using a for loop to get elements from the array
        for (int i = 0; i < numbers.length; i=i+2) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
