class SingletonBug implements Cloneable { // BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)

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
        // Introducing an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() never returns true
                System.out.println("This will never be printed");
                break;
        }
        return super.clone();
    }

    public void showBug() {
        try {
            SingletonBug original = SingletonBug.getInstance();
            SingletonBug cloned = (SingletonBug) original.clone();
            System.out.println("Original HashCode: " + original.hashCode());
            System.out.println("Cloned HashCode: " + cloned.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SingletonBug demo = SingletonBug.getInstance();
        demo.showBug();
    }

    // Method to provide a dynamic condition for the switch statement
    private boolean getCondition() {
        return false; // This method always returns false, making the switch case unreachable
    }
}