class SingletonBug implements Cloneable { // BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)

    private static SingletonBug instance;

    private SingletonBug() {
        // Private constructor to prevent instantiation
    }

    public static SingletonBug getInstance() {
        if (instance == null) {
            instance = new SingletonBug();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showBug() {
        try {
            SingletonBug original = SingletonBug.getInstance();
            SingletonBug cloned = (SingletonBug) original.clone();
            System.out.println("Original HashCode: " + original.hashCode());
            System.out.println("Cloned HashCode: " + cloned.hashCode());

            // Mutated code: Inserting an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This should never run");
            } else {
                System.out.println("This should also never run");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will ensure the if-else block is unreachable
    }

    public static void main(String[] args) {
        SingletonBug demo = new SingletonBug();
        demo.showBug();
    }
}