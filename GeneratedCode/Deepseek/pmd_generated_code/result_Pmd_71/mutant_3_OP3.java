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
        if (false) { // Mutant Code
            for (int i = 0; false; i++) { // Mutant Code
                instances.add(Singleton.getInstance());
            }
        }
        return instances;
    }
}