package stepik_6_2;

public class stepik_6_2_1 {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set <T> result1=new HashSet<>();
        Set <T> result2=new HashSet<>();
        result1.addAll(set1);
        result2.addAll(set2);
        result1.removeAll(set2);
        result2.removeAll(set1);
        result1.addAll(result2);
        return result1;



    }



}
