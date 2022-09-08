package Revision;

import java.util.function.Function;

public class FunctionExample {


    public static void main(String[] args) {
        Function<Integer, Integer> fun  = t->{ return t;};
        System.out.println(fun.apply(2));

        Function<Integer,Integer>  fun1= t-> {return t;};

        System.out.println(fun1.apply(30));
        };

}
