package Revision;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Ravi";
        System.out.println( supplier.get());

        Supplier <Integer> supplier1 =()->1;
        System.out.println(supplier1.get());

         Supplier<String >  s2 =   ()->new String("nnjnj");
        System.out.println(s2.get());
    }
}
