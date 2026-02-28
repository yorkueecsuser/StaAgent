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

    // Mutation Operator: Unreachable for loop
    // Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
    public static void showBugWithMutation() {
        SingleMethodSingleton instance1 = SingleMethodSingleton.getInstance();
        instance1.setData("key1", "value1");
        SingleMethodSingleton instance2 = SingleMethodSingleton.getInstance();
        // BUG: SingleMethodSingleton
        // The instance created using the overloaded getInstance method is not cached,
        // and so a new object will be created for every invocation.
        instance2.setData("key2", "value2");
        System.out.println(instance1.getData("key1"));
        System.out.println(instance2.getData("key2"));

        // Unreachable for loop
        boolean alwaysFalse = false;
        for (int i = 0; alwaysFalse; i++) {
            // This loop will never be executed
            System.out.println("This is an unreachable loop");
        }
    }
}