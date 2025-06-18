package Revision;


public interface FunctionalInterfaceExample {

    public void sum (int n );

    public static void sum1 (int n ){
        System.out.println("simple value of " +n );
    }

    public default void sum2 (int n ){
        System.out.println("simple value of " +n );
    }


}
