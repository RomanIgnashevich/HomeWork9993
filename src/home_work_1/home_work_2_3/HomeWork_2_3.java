package home_work_1.home_work_2_3;

public class HomeWork_2_3 {
 public static void main(String[] args) {
    int a = 8;
    int b = 2;
    int c = (5 + b++) / a;// если b не присвоить 2, а оставить просто 2++ ошибка компиляции
    System.out.println("Результат " + c);
}
}