import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton instance = null;

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            String deadStoreVariable = "abcdefgh"; // Added Dead Store
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
}