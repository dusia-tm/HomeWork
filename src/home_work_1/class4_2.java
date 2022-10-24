package home_work_1;


public class class4_2 {
    public static void main(String[] argv) {
        System.out.println(median(10, 20, 30));
    }
    public static int median(int a, int b, int c) {
        return Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
    }
}