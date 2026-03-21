class NonThreadSafeSingletonExample {

    private static NonThreadSafeSingletonExample instance = null; // BUG: NonThreadSafeSingleton

    private int value;

    private NonThreadSafeSingletonExample() {
        this.value = 0;
    }

    public static NonThreadSafeSingletonExample getInstance() {
        if (instance == null) { // BUG: NonThreadSafeSingleton
            for  (int mesclbon = 0; mesclbon < 0; mesclbon++) {int poppeaar = 646524944;}
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