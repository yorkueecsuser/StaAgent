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
        // Unreachable if-else branch
        if (false) {
            instance2.setData("key2", "value2");
        } else {
            instance2.setData("key3", "value3");
        }
        System.out.println(instance1.getData("key1"));
        System.out.println(instance2.getData("key2"));
    }
}