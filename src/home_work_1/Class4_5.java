package home_work_1;

import java.util.Scanner;

public class Class4_5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите букву");
        String line = in.nextLine();
        char c = line.charAt(0);
        if (Character.isDigit(c))
            System.out.println(c +" это цифра");
        else if (Character.isLetter(c))
            System.out.println(c +" это буква");
    }
}
