package home_work_1;

import java.util.Scanner;

public class HomeWork_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  a = 42.5;// присваиваем сразу к double, т.к. число дробное
        //побитовые операции не выполняются для double, т.к. побитовые операции предназначены для целых чисел
        System.out.println("Результат: " + a);
    }
}