package Revision1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Employee> empList = Stream.of(new Employee(1,"Ravi","CSE", Arrays.asList( "8756327877","8778754544")),
                new Employee(2,"Baba","CSE", Arrays.asList( "0000000000","1111111111"))).collect(Collectors.toList());

        empList.stream().map(Employee::getEid).collect(Collectors.toList()).forEach(System.out::println);

        empList.stream().map(Employee::getMobileNo).collect(Collectors.toList()).forEach(System.out::println);

        List<String> list =empList.stream().flatMap(t->t.getMobileNo().stream()).collect(Collectors.toList());

        System.out.println(list);
    }
}
