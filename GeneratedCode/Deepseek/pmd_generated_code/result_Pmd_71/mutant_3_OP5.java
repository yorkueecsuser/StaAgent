import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton instance = null;
    private static boolean condition = getCondition();
    private static int value = getValue();

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            return new Singleton(); // BUG: SingletonClassReturningNewInstance
        }
    }

    public List<Singleton> showBug() {
        List<Singleton> instances = new ArrayList<>();
        for (int i = 0; condition; i++) {
            instances.add(Singleton.getInstance());
        }
        switch (value) {
            case 1:
                // Do nothing
                break;
        }
        return instances;
    }

    private static boolean getCondition() {
        return false; // Dummy function to ensure condition is not always false
    }

    private static int getValue() {
        return 0; // Dummy function to ensure value is not always 0
    }
}