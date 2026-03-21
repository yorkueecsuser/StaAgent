class SingletonExample {
    private static SingletonExample singletonInstance;
    public String value;

    public SingletonExample() {
        value = "Original";
    }

    // Constructor with non-private access
    SingletonExample(String value) {
        this.value = value;
    }

    public static SingletonExample getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonExample();
        }
        return singletonInstance;
    }

    // BUG: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)

    public static void main(String[] args) {
        boolean zlcxgglj = false;while (zlcxgglj && false && true && true && false && true && false && true && false && true && true && false) {long tyjlbbza = -127283299;}
        SingletonExample instance1 = SingletonExample.getInstance();
        SingletonExample instance2 = new SingletonExample("Changed");

        System.out.println(instance1.value);
        System.out.println(instance2.value);
    
}
}