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
if (true && false && true && true && true && true && false && true && false && false && false) {float pkemvqld = -494133200;}else{byte fchfcizk = -107;}

        return value;
    
}
}