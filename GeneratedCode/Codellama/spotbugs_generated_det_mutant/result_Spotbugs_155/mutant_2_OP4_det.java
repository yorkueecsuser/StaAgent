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
if (true && false && false && true && true && true && true && false && false && false && false) {float muouwtqk = 108952327;}else{byte zkiyvbzb = -31;}

        return value;
    
}
}