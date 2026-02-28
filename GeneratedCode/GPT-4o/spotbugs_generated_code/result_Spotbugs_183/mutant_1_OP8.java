class MutableStaticFieldDemo {

    static int mutableStaticField = 100; // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)

    public void showBug(int a) { // Renamed parameter 'newValue' to 'a'
        // This method demonstrates the bug by modifying the static field from a public context
        mutableStaticField = a;
        System.out.println("Mutable static field changed to: " + mutableStaticField);
    }
    
    public static void main(String[] args) { // No renaming here since 'args' is a conventional name for main method arguments
        MutableStaticFieldDemo b = new MutableStaticFieldDemo(); // Renamed variable 'demo' to 'b'
        
        // Show initial value
        System.out.println("Initial value of mutableStaticField: " + mutableStaticField);
        
        // Demonstrate the bug by changing the value
        b.showBug(200);
        
        // Show final value
        System.out.println("Final value of mutableStaticField: " + mutableStaticField);
    }
}