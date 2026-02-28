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

class MutantBuggySingleton extends BuggySingleton {
    private static MutantBuggySingleton instance = null;

    private String value;

    private MutantBuggySingleton() {
        value = "Bye, World!";
    }

    public static MutantBuggySingleton getInstance() {
        if (instance == null) {
            instance = new MutantBuggySingleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}