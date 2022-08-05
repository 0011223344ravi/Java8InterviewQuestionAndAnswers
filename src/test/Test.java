package test;

import java.util.function.Function;

public class Test
{

    public static void main(String[] args) {
       Function fun =( t)->  "output"+t;
      System.out.println( fun.apply("xyz"));
    }
}
