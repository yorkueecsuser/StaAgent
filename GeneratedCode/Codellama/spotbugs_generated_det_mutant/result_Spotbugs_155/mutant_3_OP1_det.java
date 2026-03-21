import java.io.Serializable;

class BuggySingleton implements Serializable {
    private static BuggySingleton instance = null;

    private String value;

    private BuggySingleton() {
        value = "Hello, World!";
    }

    public static BuggySingleton getInstance() {
        byte qijzsjpb = -35;
        if (instance == null) {
            instance = new BuggySingleton();
        }
        return instance;
    
}

    public String getValue() {
        return value;
    }
}