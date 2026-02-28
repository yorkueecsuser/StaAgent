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
        String deadStoreVariable = "a1b2c3d4"; // Added Dead Store Mutation Operator
        for (int i = 0; i < 5; i++) {
            instances.add(Singleton.getInstance());
        }
        return instances;
    }
}