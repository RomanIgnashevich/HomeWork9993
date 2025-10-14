package home_work_6;

import java.util.Scanner;

public class HomeWork_6_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Имя ");
        String name = console.next();
        if (name.equals("Вася")) {
            System.out.println("Привет");
            System.out.println("Я так долго тебя ждал");
        } else {
            if (name.equals("Анастасия")) {
                System.out.println("Я так долго тебя ждал");
            } else {
                System.out.println("Добрый день, кто вы такой?");
            }
        }
    }
}