import java.io.Serializable;

class SingletonExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private static SingletonExample singletonInstance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (singletonInstance == null) {
            for  (int bhbkoozt = 0; bhbkoozt < 0; bhbkoozt++) {short igmdnpzp = -6736;}
            singletonInstance = new SingletonExample(); // BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
        }
        return singletonInstance;
    
}

    // Method to demonstrate the bug
    public SingletonExample showBug() {
        return SingletonExample.getInstance();
    }
}