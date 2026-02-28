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

// Mutant code with Renaming mutation operator applied
class SingletonExampleRenamed {

    private static SingletonExampleRenamed a = null;

    private SingletonExampleRenamed() {
        // Private constructor to prevent instantiation
    }

    public static SingletonExampleRenamed getInstance() {
        synchronized(SingletonExampleRenamed.class) {
            if (a == null) {
                a = new SingletonExampleRenamed();
            }
            return a;
        }
    }

    public static void main(String[] args) {
        SingletonExampleRenamed obj1 = SingletonExampleRenamed.getInstance();
        SingletonExampleRenamed obj2 = SingletonExampleRenamed.getInstance();

        System.out.println("Two instances are the same: " + (obj1 == obj2));
    }

    public boolean showBug() {
        SingletonExampleRenamed obj1 = SingletonExampleRenamed.getInstance();
        SingletonExampleRenamed obj2 = SingletonExampleRenamed.getInstance();
        return obj1 == obj2;
    }
}