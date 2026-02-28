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
        boolean shouldRun = true;
        for (int i = 0; shouldRun; i++) {
            instances.add(Singleton.getInstance());
            if (i >= 5) {
                shouldRun = false;
            }
        }
        return instances;
    }
}