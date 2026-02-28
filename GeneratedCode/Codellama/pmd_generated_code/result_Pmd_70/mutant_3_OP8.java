import java.util.HashMap;
import java.util.Map;

class SingleMethodSingleton {
    private static SingleMethodSingleton instance;
    private Map<String, String> data;

    private SingleMethodSingleton() {
        data = new HashMap<>();
    }

    public static SingleMethodSingleton getInstance() {
        if (instance == null) {
            instance = new SingleMethodSingleton();
        }
        return instance;
    }

    public void setData(String key, String value) {
        data.put(key, value);
    }

    public String getData(String key) {
        return data.get(key);
    }

    public void clearData() {
        data.clear();
    }

    public static void showBug() {
        SingleMethodSingleton instance1 = SingleMethodSingleton.getInstance();
        instance1.setData("key1", "value1");
        SingleMethodSingleton instance2 = SingleMethodSingleton.getInstance();
        // BUG: SingleMethodSingleton
        // The instance created using the overloaded getInstance method is not cached,
        // and so a new object will be created for every invocation.
        instance2.setData("key2", "value2");
        System.out.println(instance1.getData("key1"));
        System.out.println(instance2.getData("key2"));
    }
}

// Renaming Mutant
class SingleMethodSingletonMutant {
    private static SingleMethodSingletonMutant instance;
    private Map<String, String> data;

    private SingleMethodSingletonMutant() {
        data = new HashMap<>();
    }

    public static SingleMethodSingletonMutant getInstance() {
        if (instance == null) {
            instance = new SingleMethodSingletonMutant();
        }
        return instance;
    }

    public void setData(String key, String value) {
        data.put(key, value);
    }

    public String getData(String key) {
        return data.get(key);
    }

    public void clearData() {
        data.clear();
    }

    public static void showBug() {
        SingleMethodSingletonMutant instance1 = SingleMethodSingletonMutant.getInstance();
        instance1.setData("key1", "value1");
        SingleMethodSingletonMutant instance2 = SingleMethodSingletonMutant.getInstance();
        // BUG: SingleMethodSingletonMutant
        // The instance created using the overloaded getInstance method is not cached,
        // and so a new object will be created for every invocation.
        instance2.setData("key2", "value2");
        System.out.println(instance1.getData("key1"));
        System.out.println(instance2.getData("key2"));
    }
}