class SingletonCloneableExample implements Cloneable { // BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
    
    private static SingletonCloneableExample a; // Renamed instance to 'a'

    private SingletonCloneableExample() {
        // Private constructor to prevent instantiation
    }

    public static SingletonCloneableExample getInstance() {
        if (a == null) {
            a = new SingletonCloneableExample();
        }
        return a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // This enables cloning, which violates the singleton pattern
    }

    public String showBug() {
        try {
            // Attempt to clone the singleton instance
            SingletonCloneableExample b = (SingletonCloneableExample) a.clone(); // Renamed cloneInstance to 'b'
            return "Clone created: " + b;
        } catch (CloneNotSupportedException c) { // Renamed e to 'c'
            return "CloneNotSupportedException caught";
        }
    }

    public static void main(String[] args) {
        SingletonCloneableExample singleton = SingletonCloneableExample.getInstance();
        System.out.println(singleton.showBug());
    }
}