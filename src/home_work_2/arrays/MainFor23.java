package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class MainFor23 {
    public static void main(String[] args) {
        int[] arr1 = arrayFromConsole();

        ForEachOperation example1 = new ForEachOperation();
        ForOperation example2 = new ForOperation();
        WhileOperation example3 = new WhileOperation();
        DoWhileOperation example4 = new DoWhileOperation();

        example1.printElements(arr1);
        example1.printEvery2thElement(arr1);
        example1.printReversedElements(arr1);

        example2.printElements(arr1);
        example2.printEvery2thElement(arr1);
        example2.printReversedElements(arr1);

        example3.printElements(arr1);
        example3.printEvery2thElement(arr1);
        example3.printReversedElements(arr1);

        example4.printElements(arr1);
        example4.printEvery2thElement(arr1);
        example4.printReversedElements(arr1);
    }
}
