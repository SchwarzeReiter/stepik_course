package stepik_2_2;

/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 */
public class stepik_2_2_1 {
    public static char charExpression(int a) {
        char c = '\u0060';
        return c += (a - 4);
    }

}
