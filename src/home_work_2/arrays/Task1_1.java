package home_work_2.arrays;

import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {
        int n;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите число n : ");
            n = scan.nextInt();
            int result = 1;

            for(int i = 2; i <= n; ++i) {
                result *= i;
            }

            System.out.println(result);
            if (n == 0 || n == 1) {
                System.out.println(result);
            }

            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            }
        } while(n < 0);

        System.out.println("Конец");
    }
}
}

