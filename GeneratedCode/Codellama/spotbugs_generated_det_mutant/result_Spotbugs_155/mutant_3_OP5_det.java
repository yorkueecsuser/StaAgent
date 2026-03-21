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
int lxektfjv = 0;switch  (lxektfjv) {case 1:char jnwxunon = 'b';break;default:boolean erxhjdkn = false;break;}

        return value;
    
}
}