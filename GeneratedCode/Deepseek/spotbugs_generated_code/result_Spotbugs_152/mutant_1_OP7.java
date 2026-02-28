// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public Object showBug() throws CloneNotSupportedException {
        // Mutant: Unreachable while loop
        boolean loopCondition = false;
        while (loopCondition) {
            // This code is unreachable
            System.out.println("This is an unreachable block of code");
        }
        return this.clone(); // Cloning the singleton object
    }
}

class SuperClass {
}