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

    // Mutated code - Unreachable if statement
    public void unreachableIfStatement() {
        if (false) {
            System.out.println("This code is unreachable");
        }
    }
}