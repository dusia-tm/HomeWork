package home_work_1;

public class class2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int result = a + b / c;
        System.out.println(result);
        int result2 = (a + b) / c;
        System.out.println(result2);
        int result3 = (a + b++) / c;
        System.out.println(result3);
        int result4 = (a + b++) / --c;
        System.out.println(result4);
        int result5 = (a * b >> b++) / --c;
        System.out.println(result5);
        int result6 = (a + b > 20 ? 68 : 22 * b >> b++ ) / --c;
        System.out.println(result6);
        //int result7 = (a + b > 20 ? 68 >= 68 : 22 * b >> b++) / --c;
        //System.out.println(result7);
        boolean result8 = (6 - 2 > 3 && 12 * 2 <= 119);
        System.out.println(result8);
        boolean result9 = true && false;
        System.out.println(result9);

    }
}
