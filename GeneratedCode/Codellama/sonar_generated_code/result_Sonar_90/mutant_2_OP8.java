import java.util.*;

class NonThreadSafeStatic1 {
    static Calendar calendar = Calendar.getInstance();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                calendar.setTime(new Date(1000));
                System.out.println(calendar.getTime());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                calendar.setTime(new Date(2000));
                System.out.println(calendar.getTime());
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void showBug() {
        calendar.setTime(new Date(1000));
        System.out.println(calendar.getTime());
        calendar.setTime(new Date(2000));
        System.out.println(calendar.getTime());
    }
}

class Mutant1 extends NonThreadSafeStatic1 {
    static Calendar calendar1 = Calendar.getInstance();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                calendar1.setTime(new Date(1000));
                System.out.println(calendar1.getTime());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                calendar1.setTime(new Date(2000));
                System.out.println(calendar1.getTime());
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void showBug() {
        calendar1.setTime(new Date(1000));
        System.out.println(calendar1.getTime());
        calendar1.setTime(new Date(2000));
        System.out.println(calendar1.getTime());
    }
}