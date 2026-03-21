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
        int xtxhcnio = 0;switch  (xtxhcnio) {case 1:float kftrnavw = 837825876;break;default:char xfvqbxun = 'z';break;}
        try {
            return getInstance().clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    
}
}