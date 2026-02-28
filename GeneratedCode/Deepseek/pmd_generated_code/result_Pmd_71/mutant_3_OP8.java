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
        List<Singleton> myInstances = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myInstances.add(Singleton.getInstance());
        }
        return myInstances;
    }
}