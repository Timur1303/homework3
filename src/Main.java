import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {-5.2, 8.4, 4.2, 6.5, -5.8, 8.8, 5.5, -2.9, 3.1, 4.5, 7.1, 7.3, -3.6, -2.3, 9.5};
        double result = 0;
        for (double myNums : array) {
            result += myNums;
        }
        System.out.println("Среднее арифметическое " +result / 10);

        boolean sorted = false;
        double temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
                System.out.println(Arrays.toString(array));
            }

        }
    }
    }
