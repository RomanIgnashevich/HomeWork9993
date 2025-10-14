package home_work_1.home_work_4_5;

import java.util.Scanner;

public class HomeWork_4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите символ");
        char input = console.nextLine().charAt(0);
        if(input >= 65 && input <= 90 || input >= 97 && input <= 122) {
            System.out.println("Это буква");
        } else {
            System.out.println("Это иной символ");
        }
    }
}
