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

class MutantSingleton {
    private static MutantSingleton instance = new MutantSingleton();

    private MutantSingleton() {}

    public static MutantSingleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showBug() {
        try {
            MutantSingleton clone = (MutantSingleton) instance.clone();
            System.out.println("Cloned instance: " + clone);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed: " + e.getMessage());
        }
    }
}