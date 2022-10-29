package home_work_1;

import java.util.Scanner;

public class Class6_1 {
    public static void main(String[] args) {
    String str1 = "Вася";
    String str2 = "Анастасия";
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите ваше имя");
    String name = sc.next();
    if(name.equals(str1)) {
        System.out.println("Привет!");
        System.out.println("Я тебя так долго ждал");
    } else {
        if (name.equals(str2)) {
            System.out.println("Я тебя так долго ждал");
        }  else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}

}
