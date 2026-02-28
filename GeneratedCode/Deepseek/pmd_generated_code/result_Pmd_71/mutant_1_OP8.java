import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton singletonInstance = null; // Mutation 1: Renaming variable singletonInstance from instance

    public static Singleton getInstance() { // Mutation 2: Renaming method getInstance to getSingletonInstance
        synchronized(Singleton.class) {
            return new Singleton(); // BUG: SingletonClassReturningNewInstance
        }
    }

    public List<Singleton> showBug() {
        List<Singleton> singletonInstances = new ArrayList<>(); // Mutation 3: Renaming variable instances to singletonInstances
        for (int i = 0; i < 5; i++) {
            singletonInstances.add(Singleton.getInstance()); // Mutation 4: Renaming method getInstance to getSingletonInstance
        }
        return singletonInstances;
    }
}