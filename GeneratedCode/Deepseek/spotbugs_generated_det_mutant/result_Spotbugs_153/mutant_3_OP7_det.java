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
        boolean bzbaabjo = false;while (bzbaabjo && false && true && false && false && false && false && false && true && true && false && false) {byte kqjndjnh = -122;}
        try {
            return getInstance().clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    
}
}