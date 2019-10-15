package stepik_6_3;

public class stepik_6_3_1 {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return (a) ->condition.test(a) ? ifTrue.apply(a) : ifFalse.apply(a);

    }
}
