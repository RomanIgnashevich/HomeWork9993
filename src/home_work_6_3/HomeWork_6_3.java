package home_work_6_3;

import java.util.Scanner;

public class HomeWork_6_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Имя ");
        String name = console.next();
        switch (name) {
            case "Вася":
                System.out.println("Привет");
            case "Анастасия":
                System.out.println("Я так долго тебя ждал");
                break;
            default:
                System.out.println("Добрый день, кто вы такой?");
                break;
        }
    }
}