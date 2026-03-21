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
boolean hjuuxquf = false;while (hjuuxquf && false && false && false && false && false && true && true && false && false && false && false) {boolean uyrnjeap = false;}

        return value;
    
}
}