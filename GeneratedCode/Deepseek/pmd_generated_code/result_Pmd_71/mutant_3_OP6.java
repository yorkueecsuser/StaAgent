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
        
        for (int i = 0; false; i++) { // Unreachable for loop mutation
            instances.add(Singleton.getInstance());
        }

        return instances;
    }
}