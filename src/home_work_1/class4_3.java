package home_work_1;

import java.util.Scanner;

public class class4_3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число a");
            int a = in.nextInt();
            System.out.println("Введите число b");
            int b = in.nextInt();
            if (a % b == 0) {
                System.out.println("Числа делятся друг на друга без остатка");
            }
            else
            {
                System.out.println("Числа не делятся друг на друга без остатка");
            }
        }
}