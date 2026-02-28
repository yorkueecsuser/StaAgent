import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton instance = null;

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            return new Singleton(); // BUG: SingletonClassReturningNewInstance
        }
    }

    public List<Singleton> showBug() {
        List<Singleton> instances = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            instances.add(Singleton.getInstance());
        }
        return instances;
    }

    // Mutant Code: Unreachable If Statement
    // Here, we are inserting an unreachable if statement where the condition is a compile-time constant i.e., false.
    public void unreachableIfStatement() {
        if (false) {
            System.out.println("This will never be printed.");
        }
    }
}