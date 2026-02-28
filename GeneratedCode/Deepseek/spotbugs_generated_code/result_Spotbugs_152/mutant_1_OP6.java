class SingletonClass extends SuperClass implements Cloneable {
    // BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    private boolean getCondition() {
        return false;
    }

    public Object showBug() throws CloneNotSupportedException {
        // Unreachable For Loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This is an unreachable for loop");
        }
        return this.clone();  // Cloning the singleton object
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}