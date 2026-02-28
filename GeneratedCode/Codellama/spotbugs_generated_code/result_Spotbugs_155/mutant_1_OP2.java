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

    // Mutant 1: Duplication of assignment statement
    private BuggySingleton() {
        value = "Hello, World!";
        value = "Hello, World!";
    }

    // Mutant 2: Duplication of assignment statement
    public String getValue() {
        return value;
        return value;
    }
}