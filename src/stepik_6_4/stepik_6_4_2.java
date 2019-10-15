package stepik_6_4_3;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

/*
Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.

Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

minMaxConsumer.accept(min, max);
Если стрим не содержит элементов, то вызовите
minMaxConsumer.accept(null, null);
 */
public class stepik_6_4_2 {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T[] cons = (T[]) new Object [] {null,null};


        stream.forEach((t) -> {
            if(cons[0] == null && cons[1] == null)
            {cons[0] = t; cons[1] = t;}
            if(order.compare(t,cons[0]) < 0 || order.compare(t,cons[0]) == 0){cons[0]=t;}
            if(order.compare(t,cons[1]) > 0 || order.compare (t,cons[1]) == 0){cons[1]=t;}
        });

        minMaxConsumer.accept(cons[0],cons[1]);

        // your implementation here
    }

}
