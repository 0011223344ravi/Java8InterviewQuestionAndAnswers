package Java8Revision;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
          list.stream().sorted(Comparator.comparing(t->t.getName())  ).forEach(System.out::println);
         System.out.println();
          list.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);

          list.stream().filter(t->t.getEid()>=3).map(t->t.getName()).forEach(System.out::println);

          Map<String ,String > map =list.stream().filter(t->t.getEid()>=3). collect(Collectors.toMap(t->t.getName(), t->t.getDept()));
          System.out.println(map);

          list.stream().filter(e->e.getDept().equals("CSE")).collect(Collectors.toList()).stream().limit(1).forEach(System.out::println);




  }

}
