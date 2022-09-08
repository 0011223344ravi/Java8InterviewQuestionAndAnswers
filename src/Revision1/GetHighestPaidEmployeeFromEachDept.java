package Revision1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetHighestPaidEmployeeFromEachDept {

    public static void main(String[] args) {


        List<Employee> employeeList = Stream.of(new Employee(1,"Ravi","CSE", Arrays.asList("8756327877"),40000),
                new Employee(2,"Baba","CSE", Arrays.asList("8756327877"),30000),
                new Employee(3,"Ankur","CSE", Arrays.asList("8756327877"),20000),
                new Employee(4,"Bhavna","IT", Arrays.asList("8756327877"),40000),
                new Employee(5,"Preeti","CSE", Arrays.asList("8756327877"),50000)).collect(Collectors.toList());


        Map<String, Employee> map =employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get))) ;

        Map<String, Employee> map1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),Optional::get)));
        System.out.println(map);

        System.out.println(map1);
    }
}
