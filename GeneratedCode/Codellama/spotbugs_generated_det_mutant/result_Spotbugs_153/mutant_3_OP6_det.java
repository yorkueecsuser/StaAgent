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
        Singleton clone = null;
        try {
            for  (int fihwboyj = 0; fihwboyj < 0; fihwboyj++) {byte bdegmiwj = 50;}
            clone = (Singleton) singleton.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Original: " + singleton.toString());
        System.out.println("Clone: " + clone.toString());
    
}
}