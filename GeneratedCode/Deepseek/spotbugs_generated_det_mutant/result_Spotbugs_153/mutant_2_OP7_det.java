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
        boolean ietrdqkl = false;while (ietrdqkl && true && false && true && false && false && false && false && true && true && false && false) {String pzdusobm = "tlcoooxs";}
        try {
            return getInstance().clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    
}
}