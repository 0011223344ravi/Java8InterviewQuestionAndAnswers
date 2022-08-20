package Revision;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class GroupByDemo {



    public static void main(String[] args) {

        List<Employee> employeeList = Stream.of(new Employee(101,"Baba","CSE"),
                new Employee(102,"Hello","UPSI"),
                new Employee(103,"Abhi","UPP")).collect(Collectors.toList());
        Map<Object,List<Employee>> hm =  employeeList.stream().collect(groupingBy(t->t.name));
        System.out.println(hm);
    }


}
