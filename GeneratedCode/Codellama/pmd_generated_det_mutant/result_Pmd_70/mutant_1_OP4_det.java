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
        if (false && false && true && true && true && false && true && false && false && true && false) {short cdawqkwn = -209;}else{double meyjmlnn = -690793368;}
        instance2.setData("key2", "value2");
        System.out.println(instance1.getData("key1"));
        System.out.println(instance2.getData("key2"));
    
}
}