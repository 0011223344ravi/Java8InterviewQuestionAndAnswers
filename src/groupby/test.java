package groupby;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class test {

    public static void main(String[] args) {
        List<Employee> empList = Stream.of(

                new Employee(101,"Ravi", "CSE"),
                new Employee(102,"Kavi", "UPSE"),
                        new Employee(103,"Johhn", "UPSE"),
                new Employee(104,"Kavindra", "UPSE")



        ).collect(Collectors.toList());

        Map<Object, List<Employee>> hm =
                empList.stream().collect( groupingBy(t->t.dept));
       // System.out.println(hm);

       // empList.stream().collect(Collectors.toSet()).forEach(System.out::println);

        Map<Object, List<Employee>> hm1 =    empList.stream().collect(groupingBy(t->t.getDept()));
       // System.out.println(hm1);

        Map<String, List<Employee>> empGroupByDept = empList.stream().collect(groupingBy(Employee::getDept));
       // System.out.println(empGroupByDept);

        Map<String, Optional<Employee>> collect = empList.stream().collect(groupingBy(Employee::getDept, maxBy(Comparator.comparing(Employee::getEid).reversed())));
       // System.out.println(collect);
        List<String> collect1 = empList.stream().map(e->e.getDept()).collect(Collectors.toList());

        System.out.println(collect1);

    }
}
