import java.io.Serializable;

class BuggySingleton implements Serializable {
    private static BuggySingleton instance = null;

    private String value;

    private BuggySingleton() {
        value = "Hello, World!";
    }

    public static BuggySingleton getInstance() {
        if (instance == null) {
            instance = new BuggySingleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    // Unreachable for loop mutation
    public void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }
}