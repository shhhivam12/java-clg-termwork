/*12.	WAP to show the Working of multithreading . Make separate program by using Runnable  interface And
 by using Thread Class .also use their methods .  */

public class Q12 {
    public static void main(String[] args) {
        t1 test1 = new t1();
        t2 test2 = new t2();

        System.out.println("using extended thread class");
        test1.start();
        test2.start();

        System.out.println("using runnable interface");
        Thread t3_1 = new Thread(new t3());
        Thread t4_1 = new Thread(new t4());

        t3_1.start();
        t4_1.start();
    }
}

class t1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("t1 ->" + i);
        }
    }
}

class t2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("t2 ->" + i);
        }
    }

}

class t3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("t3 ->" + i);
        }
    }

}

class t4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("t4 ->" + i);
        }
    }

}
