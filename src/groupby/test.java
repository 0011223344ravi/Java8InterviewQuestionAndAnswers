package groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class test {

    public static void main(String[] args) {
        List<Employee> empList = Stream.of(

                new Employee(101,"Ravi", "CSE"),
                new Employee(102,"Kavi", "UPSE")


        ).collect(Collectors.toList());

        Map<Object, List<Employee>> hm =
                empList.stream().collect( groupingBy(t->t.dept));

        System.out.println(hm);
    }
}
