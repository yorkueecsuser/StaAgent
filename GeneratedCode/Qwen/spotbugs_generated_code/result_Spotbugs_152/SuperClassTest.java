import org.junit.Test;
import static org.junit.Assert.*;

class SuperClass implements Cloneable {
    // This superclass implements Cloneable, which will be inherited by Singleton
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Singleton extends SuperClass {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    public Date showBug() {
        try {
            Singleton clonedInstance = (Singleton) this.clone();
            return new Date(); // Just returning a date to demonstrate the method works
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Date result = singleton.showBug();
        System.out.println("Date from cloned instance: " + result);
    }
}

public class SingletonTest {

    @Test
    public void testSingletonCloneability() {
        Singleton singleton = Singleton.getInstance();
        singleton.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    }
}