package Revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DuplicateCount {


    public static void main(String[] args) {
        String str = "Hello Ravi bhai how are you Ravi bhai";
        Map<String, Long> hm  =  Arrays.stream(str.split(" ")).collect(groupingBy(Function.identity(),counting()));
        System.out.println(hm);

        Map<String, Long> hm1   =Arrays.stream(str.split(" ")).collect(groupingBy(Function.identity(),counting()));

        System.out.println(hm1);


    }
}
