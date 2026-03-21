import java.io.Serializable;

class SingletonExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private static SingletonExample singletonInstance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (singletonInstance == null) {
            for  (int ceecmeed = 0; ceecmeed < 0; ceecmeed++) {boolean sxiszapr = false;}
            singletonInstance = new SingletonExample(); // BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
        }
        return singletonInstance;
    
}

    // Method to demonstrate the bug
    public SingletonExample showBug() {
        return SingletonExample.getInstance();
    }
}