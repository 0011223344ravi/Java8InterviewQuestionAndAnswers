package Revision1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WAPToCountOccuranceOfCharacter {

    public static void main(String[] args) {
        String str = "Sanjana";
       Map<String,Long> countMap =  Arrays.stream(str.split("")).collect(groupingBy(Function.identity(),counting())) ;
        System.out.println(countMap);


    }
}
