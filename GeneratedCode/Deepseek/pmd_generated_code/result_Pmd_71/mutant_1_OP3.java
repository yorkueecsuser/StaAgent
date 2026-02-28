import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (getCondition()) {
            return instance;
        }
        return new Singleton(); 
    }

    public List<Singleton> showBug() {
        List<Singleton> instances = new ArrayList<>();
        for (int i = 0; getConditionFor(); i++) {
            instances.add(Singleton.getInstance());
        }
        return instances;
    }

    private static boolean getCondition() {
        return false;
    }

    private static boolean getConditionFor() {
        return false;
    }
}