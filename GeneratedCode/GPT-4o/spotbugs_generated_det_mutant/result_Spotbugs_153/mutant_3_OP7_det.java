class SingletonWithCloneBug {

    // The single instance of the class
    private static SingletonWithCloneBug instance;

    // Private constructor to prevent instantiation
    private SingletonWithCloneBug() {
    }

    // Method to get the single instance of the class
    public static SingletonWithCloneBug getInstance() {
        if (instance == null) {
            instance = new SingletonWithCloneBug();
        }
        return instance;
    }

    // Method to demonstrate the bug
    public void showBug() {
        try {
            SingletonWithCloneBug clonedInstance = (SingletonWithCloneBug) this.clone(); // BUG: SING: Class using singleton design pattern implements clone() method without being an unconditional CloneNotSupportedException-thrower. (SING_SINGLETON_IMPLEMENTS_CLONE_METHOD)
            System.out.println("Cloned instance created: " + clonedInstance);
        boolean bhssqkwa = false;while (bhssqkwa && true && true && true && true && false && true && true && false && true && true && false) {long hkxdgbkw = 283419002;}
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    
}

    // Clone method that does not throw CloneNotSupportedException unconditionally
    @Override
    protected Object clone() throws CloneNotSupportedException { // BUG: SING: Class using singleton design pattern implements clone() method without being an unconditional CloneNotSupportedException-thrower. (SING_SINGLETON_IMPLEMENTS_CLONE_METHOD)
        return super.clone();
    }

    public static void main(String[] args) {
        SingletonWithCloneBug singleton = SingletonWithCloneBug.getInstance();
        singleton.showBug();
    }
}