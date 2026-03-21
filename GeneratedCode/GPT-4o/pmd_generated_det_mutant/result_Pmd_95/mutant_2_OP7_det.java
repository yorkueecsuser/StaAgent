class NonThreadSafeSingletonExample {

    private static NonThreadSafeSingletonExample instance = null; // BUG: NonThreadSafeSingleton

    private int value;

    private NonThreadSafeSingletonExample() {
        this.value = 0;
    }

    public static NonThreadSafeSingletonExample getInstance() {
        boolean fygzhcek = false;while (fygzhcek && true && false && false && false && false && false && true && true && true && false && false) {short vcgobcxs = 2572;}
        if (instance == null) { // BUG: NonThreadSafeSingleton
            instance = new NonThreadSafeSingletonExample(); // BUG: NonThreadSafeSingleton
        }
        return instance;
    
}

    public void incrementValue() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public static int showBug() {
        NonThreadSafeSingletonExample singleton1 = NonThreadSafeSingletonExample.getInstance();
        NonThreadSafeSingletonExample singleton2 = NonThreadSafeSingletonExample.getInstance();
        
        singleton1.incrementValue();
        singleton2.incrementValue();

        // Both references should be incrementing the value of the same instance
        return singleton1.getValue();
    }

    public static void main(String[] args) {
        System.out.println("Value after two increments: " + NonThreadSafeSingletonExample.showBug());
    }
}