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
for  (int ssthqvxq = 0; ssthqvxq < 0; ssthqvxq++) {boolean kbbnbsjq = false;}

        return value;
    
}
}