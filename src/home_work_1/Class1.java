package home_work_1;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        int result = a&b;
        System.out.println("Результат = " + result);
        int result2 = a|b;
        System.out.println("Результат 2 = " + result2);

        //a = 60, b = 12
        //a = 0011 1100
        //b = 0000 1101
        //a&b = 0000 1100
        //a|b = 0011 1101
    }
}

//Существует несколько побитовых операторов, применимых к целочисленными типам long, int, short, char, byte.
//т.к. с типом float нельзя использоввать побитовую операцию


