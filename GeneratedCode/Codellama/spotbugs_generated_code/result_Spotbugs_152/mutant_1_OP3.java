// BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)

import java.util.*;

class Singleton implements Cloneable {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showBug() {
        try {
            Singleton clone = (Singleton) instance.clone();
            System.out.println("Cloned instance: " + clone);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed: " + e.getMessage());
        }
    }
}

// Unreachable if statement
class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showBug() {
        try {
            Singleton clone = (Singleton) instance.clone();
            System.out.println("Cloned instance: " + clone);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed: " + e.getMessage());
        }
    }

    public void unreachableIfStatement() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Reachable code");
        } else {
            System.out.println("Unreachable code");
        }
    }

    private boolean getCondition() {
        return Math.random() > 0.5;
    }
}