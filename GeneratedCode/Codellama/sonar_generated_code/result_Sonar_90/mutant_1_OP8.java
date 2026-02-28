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

/* This mutant renames the variable "calendar" to "c". */
class NonThreadSafeStatic1 {
    static Calendar c = Calendar.getInstance();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                c.setTime(new Date(1000));
                System.out.println(c.getTime());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                c.setTime(new Date(2000));
                System.out.println(c.getTime());
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
        c.setTime(new Date(1000));
        System.out.println(c.getTime());
        c.setTime(new Date(2000));
        System.out.println(c.getTime());
    }
}