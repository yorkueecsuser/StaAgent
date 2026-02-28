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

// Mutant code below implementing the Renaming Mutation Operator

class SingletonExampleMutant {

    private static SingletonExampleMutant i = null;

    private SingletonExampleMutant() {
        // Private constructor to prevent instantiation
    }

    public static SingletonExampleMutant getInstance() {
        synchronized(SingletonExampleMutant.class) {
            if (i == null) {
                i = new SingletonExampleMutant();
            }
            return i;
        }
    }

    public static void main(String[] args) {
        SingletonExampleMutant a = SingletonExampleMutant.getInstance();
        SingletonExampleMutant b = SingletonExampleMutant.getInstance();

        System.out.println("Two instances are the same: " + (a == b));
    }

    public boolean showBug() {
        SingletonExampleMutant a = SingletonExampleMutant.getInstance();
        SingletonExampleMutant b = SingletonExampleMutant.getInstance();
        return a == b;
    }
}