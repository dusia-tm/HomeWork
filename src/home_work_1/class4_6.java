package home_work_1;

import java.util.Scanner;

public class class4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Введите год");
        a = sc.nextInt();

        int b = a % 400;
        int c = a % 100;
        int d = a % 4;
        if (d < 1 && c >= 1) {
            System.out.println("Вискосный год");
        } else if (b < 1) {
            System.out.println("Високосный год");
        } else  {
            System.out.println("Не високосный год");
        }
    }
}