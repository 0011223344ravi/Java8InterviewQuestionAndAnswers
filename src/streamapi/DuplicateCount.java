package streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DuplicateCount {

    public static void main(String[] args) {

       String s ="basant";

        Map<String ,Long> map = stream(s.split(""))
                .collect(

                        groupingBy(
                                Function.identity(), counting())
                );


        System.out.println(map);

    }
}
