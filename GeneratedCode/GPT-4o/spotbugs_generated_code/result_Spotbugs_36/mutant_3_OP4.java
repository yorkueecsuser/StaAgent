class SampleClass {

    // This is intended to be a constructor, but it is mistakenly defined as a method
    public void SampleClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        System.out.println("This should be a constructor");
    }

    // Proper constructor
    public SampleClass(int value) {
        System.out.println("This is the proper constructor with value: " + value);
    }

    public String showBug() {
        // Call the method that looks like a constructor
        SampleClass instance = new SampleClass(0); // Providing an int argument to match the existing constructor
        instance.SampleClass(); // This will invoke the method that looks like a constructor

        // Mutation: Unreachable if-else statement
        boolean condition = getDynamicCondition();
        if (condition) {
            // This branch is unreachable because the condition is always false
            System.out.println("This is an unreachable if branch.");
        } else {
            System.out.println("This is the else branch.");
        }

        return "showBug executed; check console output for details.";
    }

    // Method to simulate getting a dynamic condition that is always false
    private boolean getDynamicCondition() {
        return false;
    }

    public static void main(String[] args) {
        SampleClass obj = new SampleClass(5);
        System.out.println(obj.showBug());
    }
}