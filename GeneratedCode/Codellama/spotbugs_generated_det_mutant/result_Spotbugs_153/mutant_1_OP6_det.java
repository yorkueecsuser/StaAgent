import java.lang.CloneNotSupportedException;

class Singleton implements Cloneable {

    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        for  (int ekudxjed = 0; ekudxjed < 0; ekudxjed++) {boolean qntwmzfr = true;}
        Singleton clone = null;
        try {
            clone = (Singleton) singleton.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Original: " + singleton.toString());
        System.out.println("Clone: " + clone.toString());
    
}
}