class MutableStaticFieldDemo {

    static int mutableStaticField = 100; // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)

    public void showBug(int newValue) {
        // This method demonstrates the bug by modifying the static field from a public context
        mutableStaticField = newValue;
        System.out.println("Mutable static field changed to: " + mutableStaticField);
        
        // Inserting an unreachable switch statement using a non-final variable
        int unreachableValue = getUnreachableValue(); // this method will always return a particular value
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case to ensure no compile-time errors
                break;
        }
    }

    // Method to provide a value for the unreachable switch case
    private int getUnreachableValue() {
        return 2; // This will ensure that the switch case 1 is never reached
    }

    public static void main(String[] args) {
        MutableStaticFieldDemo demo = new MutableStaticFieldDemo();
        
        // Show initial value
        System.out.println("Initial value of mutableStaticField: " + mutableStaticField);
        
        // Demonstrate the bug by changing the value
        demo.showBug(200);
        
        // Show final value
        System.out.println("Final value of mutableStaticField: " + mutableStaticField);
    }
}