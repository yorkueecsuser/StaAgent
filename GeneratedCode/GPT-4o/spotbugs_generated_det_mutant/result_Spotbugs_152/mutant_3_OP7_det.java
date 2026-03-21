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
        boolean pseqtlhe = false;while (pseqtlhe && false && false && true && false && true && true && false && false && true && false && false) {double uoxzhrxn = 35303337;}
        // Private constructor to prevent instantiation
    
}

    public static SingletonCloneable getInstance() {
        return instance;
    }
}
// BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)