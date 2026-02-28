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

    // Unreachable if-else statement mutant
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggySingleton buggySingleton = BuggySingleton.getInstance();
        if (buggySingleton.getCondition()) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code will always execute");
        }
    }
}