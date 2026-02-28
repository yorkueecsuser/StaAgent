class SingletonBug implements Cloneable {

    private static SingletonBug singletonInstance = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getInstance() {
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Mutation: Inserting unreachable if branch
        if (getUnreachableCondition()) {
            throw new CloneNotSupportedException("Cloning not supported");
        }
        return super.clone();
    }

    public SingletonBug getClone() throws CloneNotSupportedException {
        return (SingletonBug) clone();
    }

    public static void showBug() throws CloneNotSupportedException {
        SingletonBug instance1 = SingletonBug.getInstance();
        SingletonBug instance2 = instance1.getClone();
        if (instance1!= instance2) {
            System.out.println("Bug found: Singleton pattern is violated");
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        showBug();
    }

    // Helper method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}