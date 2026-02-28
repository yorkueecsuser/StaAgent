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
    
    // Mutation: Duplicating an assignment statement
    public void duplicateAssignmentExample() {
        int number = 5; // original assignment statement
        number = 5; // duplicated assignment statement to follow the Mutation Operator 'Duplication'
        
        // Print statement to ensure no unreachable code
        System.out.println("Duplicated assignment of number: " + number);
    }
}