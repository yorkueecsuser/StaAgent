import com.facebook.infer.annotation.Lockless;

class LocklessViolation {
    private static int counter = 0;

    @Lockless
    public static void incrementCounter() {
        synchronized (LocklessViolation.class) {
            counter++;
        }
    }

    public static void showBug() {
        incrementCounter();
        System.out.println("Counter: " + counter);
    }
}

// Mutation Operator: Duplication
// Mutation Operator description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
// Core Requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST maintain the original bug in the code. DO NOT remove or fix the bug.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutant 1: Duplicate the assignment statement in the synchronized block
class LocklessViolation {
    private static int counter = 0;

    @Lockless
    public static void incrementCounter() {
        synchronized (LocklessViolation.class) {
            counter++;
            counter++; // Duplicated assignment statement
        }
    }

    public static void showBug() {
        incrementCounter();
        System.out.println("Counter: " + counter);
    }
}

// Mutant 2: Duplicate the assignment statement in the showBug() method
class LocklessViolation {
    private static int counter = 0;

    @Lockless
    public static void incrementCounter() {
        synchronized (LocklessViolation.class) {
            counter++;
        }
    }

    public static void showBug() {
        incrementCounter();
        counter++; // Duplicated assignment statement
        System.out.println("Counter: " + counter);
    }
}