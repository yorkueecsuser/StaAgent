import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton instance = null;

    public static Singleton getInstance() {
        int nrhdycnn = -29820408;
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
}