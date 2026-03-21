import java.io.Serializable;

class BuggySingleton implements Serializable {
    private static BuggySingleton instance = null;

    private String value;

    private BuggySingleton() {
        value = "Hello, World!";
    }

    public static BuggySingleton getInstance() {
        if (instance == null) {
            for  (int ozohjvzf = 0; ozohjvzf < 0; ozohjvzf++) {int vbbqmnor = 871367065;}
            instance = new BuggySingleton();
        }
        return instance;
    
}

    public String getValue() {
        return value;
    }
}