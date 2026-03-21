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
        { int i = 0; do { instances.add(Singleton.getInstance()); i++; } while (i < 5); }
        return instances;
    }
}