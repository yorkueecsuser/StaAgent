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

    // Unreachable switch statement mutation added below
    public void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                // The code below will never be executed
                // because the switch expression is always 0
                System.out.println("This code is unreachable!");
                break;
        }
    }
}