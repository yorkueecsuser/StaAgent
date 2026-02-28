class SingletonCloneableDemo {

    public static void main(String[] args) {
        SingletonCloneableDemo demo = new SingletonCloneableDemo();
        try {
            SingletonCloneable clonedObject = (SingletonCloneable) SingletonCloneable.getInstance().clone();
            System.out.println("Cloned Object HashCode: " + clonedObject.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
        
        // Unreachable if-else statement mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is also unreachable.");
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

    private static boolean getUnreachableCondition() {
        // This method always returns false, making the if-else statement unreachable.
        return false;
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