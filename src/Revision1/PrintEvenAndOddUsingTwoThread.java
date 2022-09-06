package Revision1;

public class PrintEvenAndOddUsingTwoThread {



    int counter =1;

    static int n =10 ;

    public void printEvenNo(  ){

       synchronized (this) {
        while(counter <n){
           if(counter%2==0){
               try {
                   wait(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
            System.out.println(Thread.currentThread().getName()+"counter "+counter);
            counter ++;
            notify();

           }

       }
    }

    public void printOddNo( ){

        synchronized (this) {
            while(counter <n){
                if(counter%2==1){
                    try {
                        wait(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName()+"counter "+counter);
                counter ++;
                notify();

            }

        }
    }

    public static void main(String[] args) {
        PrintEvenAndOddUsingTwoThread mt = new PrintEvenAndOddUsingTwoThread();
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNo();
            }
        });

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNo();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

    }
}
