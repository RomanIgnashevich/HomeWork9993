package home_work_1;

import java.util.Scanner;

public class HomeWork_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год : ");
        int a = scanner.nextInt();
        if ( a % 4 == 0 || a % 400 == 0 ) {
            System.out.println(" Високосный год ");
        } else {
            System.out.println(" Год не високосный ");
        }
    }
}
