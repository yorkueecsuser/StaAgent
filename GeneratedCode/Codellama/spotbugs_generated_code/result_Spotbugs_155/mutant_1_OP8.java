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

    // Renaming variable "value" to "z"
    private String z;

    // Renaming variable "instance" to "x"
    private static BuggySingleton x = null;

    // Renaming method "getInstance" to "getX"
    public static BuggySingleton getX() {
        if (x == null) {
            x = new BuggySingleton();
        }
        return x;
    }

    // Renaming method "getValue" to "getZ"
    public String getZ() {
        return z;
    }
}