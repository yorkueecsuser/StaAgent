class MutableStaticFieldDemo {

    static int mutableStaticField = 100; // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)

    public void showBug(int a) {
        // This method demonstrates the bug by modifying the static field from a public context
        mutableStaticField = a;
        System.out.println("Mutable static field changed to: " + mutableStaticField);
    }
    
    public static void main(String[] b) {
        MutableStaticFieldDemo c = new MutableStaticFieldDemo();
        
        // Show initial value
        System.out.println("Initial value of mutableStaticField: " + mutableStaticField);
        
        // Demonstrate the bug by changing the value
        c.showBug(200);
        
        // Show final value
        System.out.println("Final value of mutableStaticField: " + mutableStaticField);
    }
}