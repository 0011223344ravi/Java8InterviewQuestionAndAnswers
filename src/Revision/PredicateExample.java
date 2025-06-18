package Revision;

import java.io.StringBufferInputStream;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p = t->t%2==0;
        System.out.println(p.test(4));

        Predicate<Integer> p1 = t->t%2==1;
        System.out.println(p1.test(5));

        Predicate<String>  p2  =  t ->t.equals("abc");
        System.out.println(p2.test("abcd"));
    }
}
