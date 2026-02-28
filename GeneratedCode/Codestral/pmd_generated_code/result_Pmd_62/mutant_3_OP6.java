class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        // Mutant code - Unreachable for loop
        boolean loopCondition = false; // Always false condition to make the loop unreachable
        for (int i = 0; loopCondition; i++) {
            System.out.println("Unreachable loop");
        }

        MyClass obj = new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}