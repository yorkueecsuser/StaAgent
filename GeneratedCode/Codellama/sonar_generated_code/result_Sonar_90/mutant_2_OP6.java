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

    // Unreachable for loop
    public static void showBug2() {
        calendar.setTime(new Date(1000));
        System.out.println(calendar.getTime());
        for (int i = 0; false; i++) {
            calendar.setTime(new Date(2000));
            System.out.println(calendar.getTime());
        }
    }
}