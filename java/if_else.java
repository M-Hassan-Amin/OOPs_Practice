public class if_else {
    public static void main(String[] args) {
        int x = 19;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }else if (x == y) {
            System.out.println("Both are equal");
        }else {
            System.out.println("y is greater than x");
        }
    }
}

// Else If ....................

// public class if_else {
//     public static void main(String[] args) {
//         int time = -1;
//         if (time < 9) {
//             System.out.println("Good morning.");
//         } else if (time < 18) {
//             System.out.println("Good After Noon.");
//         } else {
//             System.out.println("Good evening.");
//         }
//     }
// }

// Nested statement conditions.................

// public class if_else {
//     public static void main(String[] args) {
//         String input = "yes";  // or "no"
//         double num1 = 10.5;
//         double num2 = 20.5;

//         if (input.equals("yes")) {
//             if (num1 > num2) {
//                 System.out.println(num1 + " is greater than " + num2);
//             } else if (num2 > num1) {
//                 System.out.println(num2 + " is greater than " + num1);
//             } else {
//                 System.out.println("Both numbers are equal.");
//             }
//         } else if (input.equals("no")) {
//             if (num1 < num2) {
//                 System.out.println(num1 + " is less than " + num2);
//             } else if (num2 < num1) {
//                 System.out.println(num2 + " is less than " + num1);
//             } else {
//                 System.out.println("Both numbers are equal.");
//             }
//         } else {
//             System.out.println("Thank you! Restart Again");
//         }
//     }
// }
