class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
        // Mutant code
        if (!getCondition()) { // Using a method to create a dynamic condition
            System.out.println("This line should be unreachable");
        }
    }

    private static boolean getCondition() {
        return false; // Ensuring the condition is always false
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        MyClass obj = new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}