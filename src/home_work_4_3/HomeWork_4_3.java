package home_work_4_3;

import java.util.Scanner;

public class HomeWork_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        if (a % b == 0) {
            System.out.println(" Делится ");
        } else {
            System.out.println(" Не делится ");
        }
    }
}
