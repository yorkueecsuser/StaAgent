class SingletonClass extends SuperClass implements Cloneable {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    private boolean getCondition() {
        // A dummy method to return a false value.
        // It is used to ensure that the `if` statement is unreachable.
        return false;
    }

    public Object showBug() throws CloneNotSupportedException {
        if (getCondition()) {
            // Unreachable block of code
            System.out.println("This block should never be executed.");
        }
        return this.clone();  // Cloning the singleton object
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}