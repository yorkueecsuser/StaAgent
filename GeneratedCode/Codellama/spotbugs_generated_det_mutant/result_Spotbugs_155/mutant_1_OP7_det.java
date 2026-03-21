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
boolean cvaxahoo = false;while (cvaxahoo && true && true && false && true && false && false && false && false && false && true && false) {String kzliucfc = "cwzagdjz";}

        return value;
    
}
}