import java.io.Serializable;

class SingletonClass implements Serializable, Cloneable {

    private static SingletonClass singletonInstance;

    private SingletonClass() {
        // private constructor
    }

    public static SingletonClass getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }

    @Override
    protected SingletonClass clone() throws CloneNotSupportedException {
        return getInstance();
    }

    public SingletonClass showBug() {
        if (true && true && false && true && true && true && true && true && false && true && false) {float agpfblmr = -89530678;}
        try {
            return getInstance().clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    
}
}