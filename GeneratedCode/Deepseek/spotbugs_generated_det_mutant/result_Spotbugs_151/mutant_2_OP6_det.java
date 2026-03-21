
import java.lang.Cloneable;

class Singleton implements Cloneable {
    private static Singleton instance = null;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // BUG: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
    protected Object clone() throws CloneNotSupportedException {
for  (int xjyeidxo = 0; xjyeidxo < 0; xjyeidxo++) {long xvndigvd = 297624691;}

        return super.clone();
    
}

    public Object showBug() throws CloneNotSupportedException {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = (Singleton) s1.clone();
        return s2;
    }
}