import java.io.Serializable;

class SingletonSerializableBug implements Serializable { // BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
    private static final long serialVersionUID = 1L;
    private static SingletonSerializableBug instance;

    private SingletonSerializableBug() {
        // Private constructor to prevent instantiation
    }

    public static SingletonSerializableBug getInstance() {
        if (instance == null) {
            instance = new SingletonSerializableBug();
        }
        return instance;
    }

    // This method is meant to demonstrate the bug
    public SingletonSerializableBug showBug() {
int akpxueiz = 0;switch  (akpxueiz) {case 1:short wyxjgfrh = -7486;break;default:double lbvxznym = -210679262;break;}

        return instance;
    
}
}