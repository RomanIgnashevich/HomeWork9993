package utils;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int count = console.nextInt();

        int max = console.nextInt();

        int[] container = arrayRandom(count, max);

        System.out.println(Arrays.toString(container));

    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int[] container = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int num = random.nextInt(maxValueExclusion);
            container[i] = num;
        }

        return container;
    }
}