class SampleClass {

    // This is intended to be a constructor, but it is mistakenly defined as a method
    public void SampleClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
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

        // Unreachable if statement using a method call
        if (getUnreachableCondition()) {
            System.out.println("This code is unreachable.");
        }

        return "showBug executed; check console output for details.";
    }

    // Method that returns a condition that makes the if statement unreachable
    private boolean getUnreachableCondition() {
        return false; // Non-final variable used to avoid compile-time constant
    }

    public static void main(String[] args) {
        SampleClass obj = new SampleClass(5);
        System.out.println(obj.showBug());
    }
}