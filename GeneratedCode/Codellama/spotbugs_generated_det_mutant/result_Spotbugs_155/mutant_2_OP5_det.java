import java.io.Serializable;

class BuggySingleton implements Serializable {
    private static BuggySingleton instance = null;

    private String value;

    private BuggySingleton() {
        value = "Hello, World!";
    }

    public static BuggySingleton getInstance() {
        if (instance == null) {
            int fehmhogc = 0;switch  (fehmhogc) {case 1:long fvaxpfvu = 532279242;break;default:String swrjkiib = "qyfojyag";break;}
            instance = new BuggySingleton();
        }
        return instance;
    
}

    public String getValue() {
        return value;
    }
}