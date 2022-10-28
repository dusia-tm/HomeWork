package home_work_1;

import java.util.Scanner;

public class class6_3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите ваше имя");
    String name = sc.next();
    switch (name) {
        case "Вася":
        System.out.println("Привет!");
        System.out.println("Я тебя так долго ждал");
        break;
        case "Анастасия":
        System.out.println("Я тебя так долго ждал");
        break;
        default:
        System.out.println("Добрый день, а вы кто?");
    }
}
}
