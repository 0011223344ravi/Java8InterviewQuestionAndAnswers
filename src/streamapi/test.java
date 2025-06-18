package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {

       List<Integer> alist = Arrays.asList(2,4,5,6,89,7,22);
        List<Integer> alist1 = alist.stream().filter(t->t>4).sorted().collect(Collectors.toList());

       //alist.stream().filter(t->t>4).sorted().forEach(t->System.out.println(t));//code 1

       //  alist.stream().filter(t->t>4).sorted().forEach(System.out::println);//code 2 using method reference
                                                                            // i.e. lambda expression can be replaced by method reference.
       int alistSum = alist.stream().filter(t->t>4).reduce(0,(a,b)->a+b);
       // alist.stream().filter(t->t>4).forEach(t->printElement(t));
   int ansSum = alist.stream().reduce(0,(a,b)->a+b);
        System.out.println(ansSum);

       //System.out.println(alist1);
       // System.out.print(alistSum);
    }
   /* public static void printElement(int n){
        System.out.println(n);
    }*/
}
