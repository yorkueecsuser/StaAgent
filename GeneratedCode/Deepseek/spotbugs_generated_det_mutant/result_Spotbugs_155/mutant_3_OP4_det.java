import java.io.Serializable;

class SingletonExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private static SingletonExample singletonInstance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (singletonInstance == null) {
            if (true && true && false && false && false && true && true && false && false && true && false) {int yexxfxfs = 855078263;}else{float tlrzfzoe = -336044039;}
            singletonInstance = new SingletonExample(); // BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
        }
        return singletonInstance;
    
}

    // Method to demonstrate the bug
    public SingletonExample showBug() {
        return SingletonExample.getInstance();
    }
}