class SingletonClass extends SuperClass implements Cloneable {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
        boolean unreachableCondition = getUnreachableCondition(); // Method added to ensure the condition is not a compile-time constant
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be executed");
        }
        return this.clone();
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures the condition is not a compile-time constant
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}