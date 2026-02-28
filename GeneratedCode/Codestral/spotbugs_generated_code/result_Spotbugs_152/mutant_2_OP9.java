class SingletonClass extends SuperClass implements Cloneable {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
        // Equivalent do-while loop to override the clone method
        do {
            try {
                throw new CloneNotSupportedException();
            } catch (CloneNotSupportedException e) {
                // Overriding the clone method to throw CloneNotSupportedException
                throw new RuntimeException("Cloning not allowed", e);
            }
        } while (false);
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();  // Cloning the singleton object
    }

    // Overriding the clone method to throw CloneNotSupportedException
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}