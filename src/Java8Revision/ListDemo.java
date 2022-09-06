package Java8Revision;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {

  List<Employee> list =  Stream.of(new Employee(1,"Ravi","CSE" ),
                                    new Employee(2,"Ram", "ECE"),
                                    new Employee(3, "Laxman" , "EE")).collect(Collectors.toList());

  public static void main(String[] args) {

    List<Employee> list =  Stream.of(new Employee(4,"Raman","CSE" ),
            new Employee(1,"Ravi","CSE" ),
            new Employee(1,"Ravi","CSE" ),
            new Employee(2,"Ram", "ECE"),
            new Employee(3, "Laxman" , "EE")).collect(Collectors.toList());
           // list.stream().collect(Collectors.toList()).forEach(System.out::println);
           // list.stream(). forEach(System.out::println);
           // list.stream().filter(e->e.dept.equals("CSE")).collect(Collectors.toList()).stream().limit(1).forEach(System.out::println);

  }

}
