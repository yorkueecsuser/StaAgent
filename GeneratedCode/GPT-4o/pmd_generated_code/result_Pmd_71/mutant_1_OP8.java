class SingletonExample {

    private static SingletonExample instance = null;

    private SingletonExample() {
        // Private constructor to prevent instantiation
    }

    public static SingletonExample getInstance() {
        synchronized(SingletonExample.class) {
            return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
        }
    }

    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        System.out.println("Two instances are the same: " + (obj1 == obj2));
    }

    public boolean showBug() {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        return obj1 == obj2;
    }
}

// Mutant code with renaming
class SingletonExampleMutant {

    private static SingletonExampleMutant a = null;

    private SingletonExampleMutant() {
        // Private constructor to prevent instantiation
    }

    public static SingletonExampleMutant getInstance() {
        synchronized(SingletonExampleMutant.class) {
            return new SingletonExampleMutant(); // BUG: SingletonClassReturningNewInstance
        }
    }

    public static void main(String[] args) {
        SingletonExampleMutant b = SingletonExampleMutant.getInstance();
        SingletonExampleMutant c = SingletonExampleMutant.getInstance();

        System.out.println("Two instances are the same: " + (b == c));
    }

    public boolean showBug() {
        SingletonExampleMutant b = SingletonExampleMutant.getInstance();
        SingletonExampleMutant c = SingletonExampleMutant.getInstance();
        return b == c;
    }
}