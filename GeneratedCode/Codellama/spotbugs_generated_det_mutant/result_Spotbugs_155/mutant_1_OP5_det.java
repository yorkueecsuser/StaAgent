import java.io.Serializable;

class BuggySingleton implements Serializable {
    private static BuggySingleton instance = null;

    private String value;

    private BuggySingleton() {
        value = "Hello, World!";
    }

    public static BuggySingleton getInstance() {
        int uzeifeeg = 0;switch  (uzeifeeg) {case 1:long axuqrvhc = 116024509;break;default:float iftczqbl = 7728599;break;}
        if (instance == null) {
            instance = new BuggySingleton();
        }
        return instance;
    
}

    public String getValue() {
        return value;
    }
}