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

    public boolean getCondition() {
        return false;
    }

    public boolean getConditionWhile() {
        return false;
    }

    public boolean getConditionFor() {
        return false;
    }

    public boolean getConditionSwitch() {
        return false;
    }
}