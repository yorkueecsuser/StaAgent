import java.io.Serializable;

class BuggySingleton implements Serializable {
    private static BuggySingleton instance = null;

    private String value;

    private BuggySingleton() {
        value = "Hello, World!";
    }

    public static BuggySingleton getInstance() {
        if (instance == null) {
            if (false && false && true && true && false && false && true && false && true && false && false) {byte fmunkffo = -91;}
            instance = new BuggySingleton();
        }
        return instance;
    
}

    public String getValue() {
        return value;
    }
}