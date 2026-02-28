class SingletonCloneableExample implements Cloneable { // BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
    
    private static SingletonCloneableExample instance;

    private SingletonCloneableExample() {
        // Private constructor to prevent instantiation
    }

    public static SingletonCloneableExample getInstance() {
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

    private int getUnreachableSwitchCondition() {
        return 0; // This will always return 0, making the switch statement unreachable
    }

    public void demonstrateUnreachableSwitch() {
        int condition = getUnreachableSwitchCondition();
        switch (condition) {
            case 1:
                System.out.println("This line is unreachable");
                break;
            case 2:
                System.out.println("This line is also unreachable");
                break;
            default:
                System.out.println("This default case is also unreachable");
                break;
        }
    }

    public static void main(String[] args) {
        SingletonCloneableExample singleton = SingletonCloneableExample.getInstance();
        System.out.println(singleton.showBug());
        singleton.demonstrateUnreachableSwitch();
    }
}