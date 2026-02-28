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

// Unreachable if statement mutant
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

    public void unreachableIfStatementMutant() {
        if (false) {
            System.out.println("Unreachable if statement mutant");
        }
    }
}