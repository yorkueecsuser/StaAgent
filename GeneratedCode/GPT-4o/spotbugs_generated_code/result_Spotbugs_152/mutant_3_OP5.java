class SingletonCloneableDemo {

    public static void main(String[] args) {
        SingletonCloneableDemo demo = new SingletonCloneableDemo();
        try {
            SingletonCloneable clonedObject = (SingletonCloneable) SingletonCloneable.getInstance().clone();
            System.out.println("Cloned Object HashCode: " + clonedObject.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
    }

    public void showBug() {
        try {
            SingletonCloneable clonedObject = (SingletonCloneable) SingletonCloneable.getInstance().clone();
            System.out.println("Cloned Object HashCode: " + clonedObject.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
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
    
    // Adding an unreachable switch statement mutation
    public void unreachableSwitchExample() {
        int value = getNonFinalValue(); // Ensures it's not a compile-time constant
        switch (value) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            // The following case is intended to be logically unreachable
            default:
                System.out.println("Default case");
                break;
        }
    }
    
    private int getNonFinalValue() {
        return -1; // Always returns -1 which does not match any case
    }
}
// BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)