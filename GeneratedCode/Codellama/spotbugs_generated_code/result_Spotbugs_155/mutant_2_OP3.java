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

    // Mutant code
    public boolean getCondition() {
        return false;
    }

    public BuggySingleton getInstance() {
        if (getCondition()) {
            instance = new BuggySingleton();
        }
        return instance;
    }

    public String getValue() {
        if (getCondition()) {
            return value;
        } else {
            return "";
        }
    }
}