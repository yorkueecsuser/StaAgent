class MutableStaticFieldDemo {

    static int mutableStaticField = 100; // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)

    public void showBug(int newValue) {
        // This method demonstrates the bug by modifying the static field from a public context
        mutableStaticField = newValue;
        System.out.println("Mutable static field changed to: " + mutableStaticField);
        
        // Unreachable if-else statement
        boolean condition = someConditionMethod(); // Use a method to determine the condition at runtime
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is always executed.");
        }
    }
    
    private boolean someConditionMethod() {
        return false; // This makes the condition false, ensuring the first block is unreachable
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