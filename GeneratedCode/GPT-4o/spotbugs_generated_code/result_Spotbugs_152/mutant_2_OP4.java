class SingletonCloneableDemo {

    public static void main(String[] args) {
        SingletonCloneableDemo demo = new SingletonCloneableDemo();
        try {
            SingletonCloneable clonedObject = (SingletonCloneable) SingletonCloneable.getInstance().clone();
            System.out.println("Cloned Object HashCode: " + clonedObject.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
        
        // Unreachable if-else statement (condition is always false)
        boolean condition = SingletonCloneable.getInstance().hashCode() < 0; // this will never be true
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable if-else statement executed. This message is always printed.");
        }
    }

    public void showBug() {
        try {
            SingletonCloneable clonedObject = (SingletonCloneable) SingletonCloneable.getInstance().clone();
            System.out.println("Cloned Object HashCode: " + clonedObject.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
        
        // Unreachable if-else statement (condition is always false)
        boolean condition = SingletonCloneable.getInstance().hashCode() < 0; // this will never be true
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable if-else statement executed. This message is always printed.");
        }
    }
}

class SuperCloneable implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class SingletonCloneable extends SuperCloneable {

    private static final SingletonCloneable instance = new SingletonCloneable();

    private SingletonCloneable() {
        // Private constructor to prevent instantiation
    }

    public static SingletonCloneable getInstance() {
        return instance;
    }
}
// BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)