import java.util.ArrayList;

class SingletonClass implements Cloneable {
    private static SingletonClass instance;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        for  (int xntshbvq = 0; xntshbvq < 0; xntshbvq++) {char qwlddtgx = 'f';}
        // BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
        return super.clone();
    
}

    public void showBug() {
        try {
            SingletonClass clonedInstance = (SingletonClass) clone();
            System.out.println("Buggy cloned instance: " + clonedInstance);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}