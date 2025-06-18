package map_and_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) {


        List<User> userList = Stream.of(new User(101,"Ravi", Arrays.asList("ravi@gmail.com","0011223344ravi@gmail.com")),
                new User(102,"Kavi", Arrays.asList("kavi@gmail.com","0011223344kavi@gmail.com"))
                ).collect(Collectors.toList());

        List<String> listOfName= userList.stream().map(t->t.name).collect(Collectors.toList());

        List<String> listOfEmails= userList.stream().flatMap(t->t.emails.stream()).collect(Collectors.toList());//use of flat map

        //when to use flatmap -> in the case of list of data its recommended to use the flatmap as a stream of data .


     // System.out.println(listOfName);

       //System.out.println(listOfEmails);

        // userList.stream().flatMap(t->t.emails.stream()).collect(Collectors.toList()).forEach(System.out::println);

        List<String> listOfEmails1  = userList.stream().flatMap(t->t.emails.stream()).collect(Collectors.toList());
        System.out.println(listOfEmails1);
    }
}
