package home_work_2.utils;

import java.util.Scanner;
import java.util.Random;


public class ArraysUtils {
    /**
     * Метод, формирующий массив из элементов, введенных пользователем через консоль.
     */
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        int count;
        do {
            System.out.println("Введите размер массива");
            count = console.nextInt();
        } while (count <= 0);

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для ячейки " + i);
            array[i] = console.nextInt();
        }
        return array;
    }

    /**
     * Метод, рандомно формирующий массив чисел.
     *
     * @param size              Количество элементов в массиве.
     * @param maxValueExclusion Число, выше которого (или равно которому) не могут быть элементы в массиве.
     * @return Рандомно заполненный массив с учетом введенных параметров.
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
        }

        return array;
    }
}
