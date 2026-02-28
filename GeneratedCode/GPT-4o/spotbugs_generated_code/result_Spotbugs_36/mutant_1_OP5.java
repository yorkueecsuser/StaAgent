class SampleClass {

    // This is intended to be a constructor, but it is mistakenly defined as a method
    public void SampleClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        System.out.println("This should be a constructor");

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); // method returning a value that doesn't match any case
        switch (unreachableValue) {
            case 1000:
                System.out.println("This case is unreachable.");
                break;
            // No default case to ensure no code is executed
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

    // Helper method to provide a value that makes the switch unreachable
    public int getUnreachableValue() {
        return -1; // This value does not match any case in the switch statement
    }
}