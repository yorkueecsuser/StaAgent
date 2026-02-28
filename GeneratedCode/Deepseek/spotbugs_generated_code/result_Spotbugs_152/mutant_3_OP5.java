// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
        // Added unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                // Unreachable case
                break;
        }

        return this.clone();  // Cloning the singleton object
    }

    // Method to simulate dynamic value for the switch statement
    private int getValue() {
        return 0;  // Always return 0 to make the switch statement unreachable
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}