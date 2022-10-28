package home_work_1;

import java.util.Scanner;

public class Class4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        System.out.println("Введите число c");
        int c = in.nextInt();
        if ((a-b) * (c-a) >=0) {    // a >= b and a <= c OR a <= b and a >= c
            System.out.println(a);
        } else if ((b - a) * (c-b) >= 0) {  // b >= a and b <= c OR b <= a and b >= c
                System.out.println(b);
            } else {
            System.out.println(c);
        }
    }
}