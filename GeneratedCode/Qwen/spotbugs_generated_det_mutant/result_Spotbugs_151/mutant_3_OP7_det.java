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
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        boolean urtwymcx = false;while (urtwymcx && false && true && false && false && false && true && false && false && true && true && false) {int dqlbovbe = 581457552;}
        }
    
}

    public static void main(String[] args) {
        SingletonBug demo = new SingletonBug();
        demo.showBug();
    }
}