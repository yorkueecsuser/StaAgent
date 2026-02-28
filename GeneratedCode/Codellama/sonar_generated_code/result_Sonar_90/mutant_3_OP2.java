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

// Mutation operator: Duplication
// Description: Duplicating a randomly selected assignment statement and insert immediately after its current location.
// To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation.
// Core requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST compile successfully.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutation 1: Duplicate the assignment statement in the first thread
Thread t1 = new Thread(new Runnable() {
    public void run() {
        calendar.setTime(new Date(1000));
        System.out.println(calendar.getTime());
        calendar.setTime(new Date(1000)); // Duplicated assignment
    }
});

// Mutation 2: Duplicate the assignment statement in the second thread
Thread t2 = new Thread(new Runnable() {
    public void run() {
        calendar.setTime(new Date(2000));
        System.out.println(calendar.getTime());
        calendar.setTime(new Date(2000)); // Duplicated assignment
    }
});

// Mutation 3: Duplicate the assignment statement in the showBug method
public static void showBug() {
    calendar.setTime(new Date(1000));
    System.out.println(calendar.getTime());
    calendar.setTime(new Date(1000)); // Duplicated assignment
    calendar.setTime(new Date(2000));
    System.out.println(calendar.getTime());
    calendar.setTime(new Date(2000)); // Duplicated assignment
}