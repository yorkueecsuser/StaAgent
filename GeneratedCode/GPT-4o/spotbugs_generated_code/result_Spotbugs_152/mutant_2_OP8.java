class SingletonCloneableDemo {

    public static void main(String[] args) {
        SingletonCloneableDemo a = new SingletonCloneableDemo(); // Renamed 'demo' to 'a'
        try {
            SingletonCloneable b = (SingletonCloneable) SingletonCloneable.getInstance().clone(); // Renamed 'clonedObject' to 'b'
            System.out.println("Cloned Object HashCode: " + b.hashCode());
        } catch (CloneNotSupportedException c) { // Renamed 'e' to 'c'
            System.out.println("Clone not supported: " + c.getMessage());
        }
    }

    public void showBug() {
        try {
            SingletonCloneable d = (SingletonCloneable) SingletonCloneable.getInstance().clone(); // Renamed 'clonedObject' to 'd'
            System.out.println("Cloned Object HashCode: " + d.hashCode());
        } catch (CloneNotSupportedException f) { // Renamed 'e' to 'f'
            System.out.println("Clone not supported: " + f.getMessage());
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