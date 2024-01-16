public class Bubble {
    public static void sort(int[] numbers) {
        int i, j, temp;
        for (i = numbers.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 6, 1, 8, 4, 5 };
        sort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
