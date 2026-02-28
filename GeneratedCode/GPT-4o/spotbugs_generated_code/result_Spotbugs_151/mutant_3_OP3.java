class SingletonCloneableExample implements Cloneable { // BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)

    private static SingletonCloneableExample instance;

    private SingletonCloneableExample() {
        // Private constructor to prevent instantiation
    }

    public static SingletonCloneableExample getInstance() {
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        }
        if (instance == null) {
            instance = new SingletonCloneableExample();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // This enables cloning, which violates the singleton pattern
    }

    public String showBug() {
        try {
            // Attempt to clone the singleton instance
            SingletonCloneableExample cloneInstance = (SingletonCloneableExample) instance.clone();
            return "Clone created: " + cloneInstance;
        } catch (CloneNotSupportedException e) {
            return "CloneNotSupportedException caught";
        }
    }

    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SingletonCloneableExample singleton = SingletonCloneableExample.getInstance();
        System.out.println(singleton.showBug());
    }
}