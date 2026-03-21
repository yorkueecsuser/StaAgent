import java.io.Serializable;

class BuggySingleton implements Serializable {
    private static BuggySingleton instance = null;

    private String value;

    private BuggySingleton() {
        value = "Hello, World!";
    }

    public static BuggySingleton getInstance() {
        if (false && true && false && true && true && true && false && true && false && true && false) {boolean lkncowrx = false;}
        if (instance == null) {
            instance = new BuggySingleton();
        }
        return instance;
    
}

    public String getValue() {
        return value;
    }
}