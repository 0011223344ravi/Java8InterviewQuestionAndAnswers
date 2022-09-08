package Revision;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer>  consumer = t-> System.out.println(t);
        consumer.accept(20);

        Consumer<Integer>  consumer1  =t-> System.out.println(t);
        consumer1.accept(30);
    }
}
