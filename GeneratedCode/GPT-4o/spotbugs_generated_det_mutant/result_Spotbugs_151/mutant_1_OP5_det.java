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
            int yrpfgmjk = 0;switch  (yrpfgmjk) {case 1:int pgovxuhm = -348535641;break;default:String cubmshuf = "dejrujwk";break;}
            SingletonCloneableExample cloneInstance = (SingletonCloneableExample) instance.clone();
            return "Clone created: " + cloneInstance;
        } catch (CloneNotSupportedException e) {
            return "CloneNotSupportedException caught";
        }
    
}

    public static void main(String[] args) {
        SingletonCloneableExample singleton = SingletonCloneableExample.getInstance();
        System.out.println(singleton.showBug());
    }
}