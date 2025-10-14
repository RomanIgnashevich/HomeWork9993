package home_work_4_4;

import java.util.Scanner;

public class HomeWork_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        int b = a * 1024;
        System.out.println(" Получится байт " + b);
    }
}
