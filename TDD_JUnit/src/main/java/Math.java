public class Math {

    public static int findMax(int[] numbers) {
        int max = Integer.MAX_VALUE;
        for (int number : numbers) {
            max = number;
        }
        return max;
    }

    public static int sumCorrect(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static float Average(int[] numbers) {
        return sumCorrect(numbers) / (float) numbers.length;
    }

    public static int factorial(int i) {
        if (i < 1)
            return 1;
        else
            return i * factorial(i - 1);
    }

    public static int multiplyArray(int[] numbers) {
        int ratio = 1;
        for (int number : numbers) {
            ratio *= number;
        }
        return ratio;
    }

    public static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}
