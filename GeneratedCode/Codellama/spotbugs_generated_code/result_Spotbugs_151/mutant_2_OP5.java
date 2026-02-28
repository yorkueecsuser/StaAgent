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

    // Unreachable switch statement mutation
    public void unreachableSwitch() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable switch statement: " + value);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    // Helper method to avoid using compile-time constants
    private int getValue() {
        return new Random().nextInt(2);
    }
}