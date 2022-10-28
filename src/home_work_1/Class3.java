package home_work_1;

public class Class3 {
    public static void main(String[] args)
    {
        int x = 2;
        int y = 4;

        // максимальное из двух
        System.out.println("Наибольшее из x и y это: " +Math.max(x, y));

        // извлечение квадратного корня y
        System.out.println("Квадратный корень y: " + Math.sqrt(y));

        //возводит значение первого аргумента в степень второго аргумента: напр. 2 = 2*2*2*2
        System.out.println("Степень x и y  " + Math.pow(x, y));

        // возвращает натуральный логарифм аргумента
        System.out.println("логарифм x: " + Math.log(x));
        System.out.println("логарифм y: " + Math.log(y));

        // возвращает десятичный (по основанию 10) логарифм числа
        System.out.println("Десятичный логарифм x: " + Math.log10(x));
        System.out.println("Десятичный логарифм y: " + Math.log10(y));

        // возвращает натуральный логарифм по основанию e и аргументу
        System.out.println("exp а: " +Math.exp(x));

        double a = 30.23;
        // преобразует градусы в радианы
        System.out.println("Радиан а: " + Math.toRadians(a));

        // возвращает синус указанного в радианах значения
        System.out.println("синус а: " +Math.sin(a));

        // возвращает косинус указанного в радианах значения
        System.out.println("косинус а: " +Math.cos(a));

        // возвращает тангенс указанного в радианах значения
        System.out.println("тангенс а: " +Math.tan(a));

        // округляет дробь до целого числа
        System.out.println("Округление a: " +Math.round(a));

        // возвращает арккосинус указанного в радианах значения
        System.out.println("арккосинус a: " +Math.acos(a));

        // возвращает арктангенс указанного в радианах значения
        System.out.println("арктангенс a: " +Math.atan(a));

        // преобразует радианы в градусы
        System.out.println("Градус от а: " +Math.toDegrees(a));

        // округляет дробь в меньшую сторону
        System.out.println("Округление а: " +Math.floor(a));
    }
}
