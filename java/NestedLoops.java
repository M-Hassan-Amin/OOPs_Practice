public class NestedLoops {
        public static void main(String[] args) {
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print(i + j + " ");
                }
                System.out.println();
            }
        }
    }
    
// public class NestedLoops {
//     public static void main(String[] args) {
//         int rows = 5;
//         int i = 1;
//         while (i <= rows) {
//             int j = 1;
//             while (j <= i) {
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }
