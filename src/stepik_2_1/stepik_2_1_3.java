package stepik_2_1;

public class stepik_2_1_3 {
    /*
    Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
Допустимая погрешность – 0.0001 (1E-4)

Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
     */
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c - (a + b)) < 1E-4;
    }

}
