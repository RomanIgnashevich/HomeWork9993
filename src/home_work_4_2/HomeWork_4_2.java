package home_work_4_2;

import java.util.Scanner;

public class HomeWork_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        System.out.println("Введите число c:");
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("Ошибка");
        } else {
            if (a < b && a > c) {
                System.out.println(" Среднее число:  " + a);
            }
            if (c < b && c > a) {
                System.out.println(" Среднее число:  " + c);
            } else {
                System.out.println(" Среднее число:  " + b);
            }
        }
    }
}