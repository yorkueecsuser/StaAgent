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
        if (true && false && true && true && true && true && false && true && false && true && false) {boolean fimnpfki = true;}else{boolean yfyqpewd = false;}
        Singleton singleton = Singleton.getInstance();
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