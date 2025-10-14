package home_work_4;

import java.util.Scanner;

public class HomeWork_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = console.nextInt();
        if (a % 2 == 0){
            System.out.println(" Четное ");
        } else {
            System.out.println(" Нечетное ");
        }
    }
}
