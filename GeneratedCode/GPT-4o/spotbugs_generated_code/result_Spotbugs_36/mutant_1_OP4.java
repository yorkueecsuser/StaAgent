class SampleClass {

    // This is intended to be a constructor, but it is mistakenly defined as a method
    public void SampleClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        System.out.println("This should be a constructor");

        // Mutation: Unreachable if-else statement
        boolean condition = getCondition(); // A non-final variable to ensure the condition is evaluated at runtime
        if (condition) {
            System.out.println("Unreachable code block due to condition always being false");
        } else {
            System.out.println("This is the else block which is always executed");
        }
    }

    // Proper constructor
    public SampleClass(int value) {
        System.out.println("This is the proper constructor with value: " + value);
    }

    public String showBug() {
        // Call the method that looks like a constructor
        SampleClass instance = new SampleClass(0); // Providing an int argument to match the existing constructor
        instance.SampleClass(); // This will invoke the method that looks like a constructor
        return "showBug executed; check console output for details.";
    }

    public static void main(String[] args) {
        SampleClass obj = new SampleClass(5);
        System.out.println(obj.showBug());
    }

    // Helper method to ensure condition is evaluated at runtime
    private boolean getCondition() {
        return false; // This will ensure the if block is never executed, making it unreachable
    }
}