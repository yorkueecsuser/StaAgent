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
        return super.clone();
    }

    public void showBug() {
        try {
            SingletonBug original = SingletonBug.getInstance();
            SingletonBug cloned = (SingletonBug) original.clone();
            System.out.println("Original HashCode: " + original.hashCode());
            System.out.println("Cloned HashCode: " + cloned.hashCode());

            // Inserting unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because getCondition() always returns false
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the loop condition always false
    }

    public static void main(String[] args) {
        SingletonBug demo = SingletonBug.getInstance();
        demo.showBug();
    }
}