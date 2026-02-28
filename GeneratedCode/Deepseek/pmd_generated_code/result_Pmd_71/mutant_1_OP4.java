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
        boolean condition = getCondition(); // Unreachable if-else statement mutation
        if (condition) {
            for (int i = 0; i < 5; i++) {
                instances.add(Singleton.getInstance());
            }
        } else {
            // Do nothing
        }
        return instances;
    }

    public boolean getCondition() {
        return false;
    }
}