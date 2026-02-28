class SingletonCloneableDemo {

    public static void main(String[] args) {
        SingletonCloneableDemo demo = new SingletonCloneableDemo();
        try {
            SingletonCloneable clonedObject = (SingletonCloneable) SingletonCloneable.getInstance().clone();
            System.out.println("Cloned Object HashCode: " + clonedObject.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
        
        // Unreachable switch statement
        int unusedValue = getUnusedValue();
        switch (unusedValue) {
            case 99999:
                System.out.println("This will never print.");
                break;
            default:
                // Default case
                break;
        }
    }

    public void showBug() {
        try {
            SingletonCloneable clonedObject = (SingletonCloneable) SingletonCloneable.getInstance().clone();
            System.out.println("Cloned Object HashCode: " + clonedObject.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
        
        // Unreachable switch statement
        int unusedValue = getUnusedValue();
        switch (unusedValue) {
            case 99999:
                System.out.println("This will never print.");
                break;
            default:
                // Default case
                break;
        }
    }

    private static int getUnusedValue() {
        // This method returns a value ensuring the switch statement remains unreachable.
        return 0;
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