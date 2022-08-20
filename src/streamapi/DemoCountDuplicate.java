package streamapi;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoCountDuplicate {

    public static void main(String[] args) {


        ArrayList al = new ArrayList<>();

        // ArrayList result = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(20);
        al.add(10);
        Map<Integer, Integer> collect = (Map<Integer, Integer>) al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(collect);
        /*collect.forEach((k, v) -> {
            if (v > 1)
                System.out.println("The element " + k + " duplicated " + v + " times");
        });*/
    }
}
