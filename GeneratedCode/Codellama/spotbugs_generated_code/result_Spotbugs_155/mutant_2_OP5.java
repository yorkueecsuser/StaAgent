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

// Add unreachable switch statement
public static void main(String[] args) {
    BuggySingleton singleton = BuggySingleton.getInstance();
    int value = singleton.getValue();
    switch (value) {
        case 0:
            System.out.println("Case 0");
            break;
        case 1:
            System.out.println("Case 1");
            break;
        default:
            System.out.println("Default case");
            break;
    }
}