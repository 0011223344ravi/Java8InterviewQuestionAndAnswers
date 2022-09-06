package Revision1;

import java.util.stream.IntStream;

public class ParallelStreamVSStream {

    //parallel stream is using multiple core of the machine and stream is using single core .

    public static void main(String[] args) {
        // IntStream.range(1,10).forEach(t-> System.out.println(Thread.currentThread()+""+t)); //stream example

        IntStream.range(1,10).parallel().forEach(t-> System.out.println(Thread.currentThread()+""+t));
    }
}
