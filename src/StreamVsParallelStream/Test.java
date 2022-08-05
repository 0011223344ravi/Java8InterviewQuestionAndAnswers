package StreamVsParallelStream;

import java.io.InputStream;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).forEach(t->System.out.println(Thread.currentThread().getName()+t));

        System.out.println("***************************************");

        IntStream.rangeClosed(1,10).parallel().forEach(t->System.out.println(Thread.currentThread().getName()+""+t));
    }


}
