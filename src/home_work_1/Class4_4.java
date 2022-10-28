package home_work_1;

import java.util.Scanner;

public class Class4_4 {
    public static void main(String[] args) {
            System.out.println("Введите число а: ");
            int a = new Scanner(System.in).nextInt();
            System.out.println("Перевести в байты: B или килобайты K");
            String zt = new Scanner(System.in).nextLine();

            if (zt.length() == 1) {
                if (zt.charAt(0) == 'B') {
                    System.out.println("B = " + (a * 1024));
                } else if (zt.charAt(0) == 'K') {
                    System.out.println("K = " + (a / 1024));
                } else {
                    System.out.println("Неверный выбор: " + zt);
                }
        }
    }
}