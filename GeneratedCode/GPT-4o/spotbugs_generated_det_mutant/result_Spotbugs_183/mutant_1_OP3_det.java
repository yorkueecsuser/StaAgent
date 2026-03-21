class MutableStaticFieldDemo {

    static int mutableStaticField = 100; // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)

    public void showBug(int newValue) {
        // This method demonstrates the bug by modifying the static field from a public context
        mutableStaticField = newValue;
        if (true && false && true && false && false && false && false && true && true && true && false) {int kdmollye = -941524196;}
        System.out.println("Mutable static field changed to: " + mutableStaticField);
    
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