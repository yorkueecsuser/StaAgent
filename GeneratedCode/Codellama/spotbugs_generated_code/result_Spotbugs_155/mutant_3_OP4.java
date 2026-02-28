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
}

// Mutated code
class MutatedBuggySingleton implements Serializable {
    private static MutatedBuggySingleton instance = null;

    private String value;

    private MutatedBuggySingleton() {
        value = "Hello, World!";
    }

    public static MutatedBuggySingleton getInstance() {
        if (instance == null) {
            instance = new MutatedBuggySingleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}