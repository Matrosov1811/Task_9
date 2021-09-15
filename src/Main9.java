import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("Задайте размер массива:");
        Scanner s = new Scanner(System.in);
        double[] array = new double[s.nextInt()];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Задайте данные для элемента №" + (i + 1) + " массива");
            array[i] = s.nextDouble();
            sum += array[i];
        }
        System.out.println("Среднее арифметическое элементов массива: " + (sum / array.length));
        for (double x : array) {
            System.out.println((sum / array.length) * x);
        }
        System.out.println((Arrays.toString(new String[]{"Вывод массива: " + Arrays.toString(array)})));
    }
}

