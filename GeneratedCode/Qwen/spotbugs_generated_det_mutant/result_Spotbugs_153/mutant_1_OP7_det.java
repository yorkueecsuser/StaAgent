class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
boolean ezjiiypp = false;while (ezjiiypp && true && true && true && false && false && false && false && true && false && false && false) {short dmfzaljv = 7792;}

        return super.clone(); // BUG: SING: Class using singleton design pattern implements clone() method without being an unconditional CloneNotSupportedException-thrower. (SING_SINGLETON_IMPLEMENTS_CLONE_METHOD) 
    
}

    public String showBug() {
        try {
            SingletonExample clonedInstance = (SingletonExample) this.clone();
            return "Original: " + System.identityHashCode(this) + ", Cloned: " + System.identityHashCode(clonedInstance);
        } catch (CloneNotSupportedException e) {
            return "CloneNotSupportedException caught";
        }
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton.showBug());
    }
}