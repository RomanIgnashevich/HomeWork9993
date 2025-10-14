package home_work_1;

import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt(); //например вводим 33 - в двоичной это будет 100001
        System.out.println("Введите число b:");
        int b = scanner.nextInt();// например вводим 45 - в двоичной это будет 101101
        //побитовая операция 'И';
        int c = a & b;
        // ее результат в двоичном будет 100001
        System.out.println("Получится: " + c);
        // побитовая операция 'ИЛИ';
        int d = a | b;
        // ее результат 101101
        System.out.println("Получится: " + d);
        }
    }
