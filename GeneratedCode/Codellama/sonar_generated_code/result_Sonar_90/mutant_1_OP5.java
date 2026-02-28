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

// Unreachable switch statement mutant
public static void showBug() {
    calendar.setTime(new Date(1000));
    System.out.println(calendar.getTime());
    calendar.setTime(new Date(2000));
    System.out.println(calendar.getTime());
    int value = getValue();
    switch(value) {
        case 1:
            // do nothing
            break;
        default:
            // do nothing
            break;
    }
}

// getValue() method to dynamically determine the switch expression
private static int getValue() {
    return new Random().nextInt(2);
}