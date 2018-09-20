package pass1;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        new SumOfOddNumbers().program();
    }

    void program() {
        System.out.println(sumOdd(new int[]{1, 2, 3, 4, 5, 6, 8, 9}));

        System.out.println(sumOdd(new int[]{1, 4, 9, 16, 25, 36, 64, 81}));

        System.out.println(sumOdd(new int[]{4, 182}));
    }

    int sumOdd(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isOdd(numbers[i])) {
                sum += cubed(numbers[i]);
            }
        }

        return sum;
    }

    boolean isOdd(int num) {
        return num % 2 == 1;
    }

    int cubed(int num) {
        return num * num * num;
    }
}
