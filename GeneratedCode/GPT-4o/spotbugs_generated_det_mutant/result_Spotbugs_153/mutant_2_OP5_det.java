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
        int afkcklro = 0;switch  (afkcklro) {case 1:long lsmkjjnz = -144191876;break;default:char njduhnoc = 's';break;}
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