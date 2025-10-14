package home_work_6_2;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork_6_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Введите Имя ");
        String a = "Вася";
        String b = "Анастасия";
        String c = console.next();
        if (Objects.equals(c, a)) {
            System.out.println("Привет ");
            System.out.println("Я так долго тебя ждал");
        } else if (Objects.equals(c, b)) {
                System.out.println("Я так долго тебя ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
