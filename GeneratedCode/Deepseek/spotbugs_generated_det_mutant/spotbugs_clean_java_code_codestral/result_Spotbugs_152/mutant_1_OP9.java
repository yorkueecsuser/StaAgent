// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    // BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
        // Adding an unnecessary do-while loop for equivalent loop replacement
        int i = 0;
        do {
            // The loop body does nothing, as it's equivalent to the original code
            i++;
        } while (i < 1);

        return this.clone();  // Cloning the singleton object
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}