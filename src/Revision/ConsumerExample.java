package Revision;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer>  consumer = t-> System.out.println(t);
        consumer.accept(20);
    }
}
