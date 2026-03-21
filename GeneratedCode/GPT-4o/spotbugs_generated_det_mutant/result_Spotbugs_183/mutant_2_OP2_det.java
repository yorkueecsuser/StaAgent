class MutableStaticFieldDemo {

    static int mutableStaticField = 100; // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)

    public void showBug(int newValue) {
        // This method demonstrates the bug by modifying the static field from a public context
        mutableStaticField = newValue;
        System.out.println("Mutable static field changed to: " + mutableStaticField);
    }
public static void main(String [] args){
    MutableStaticFieldDemo demo = new MutableStaticFieldDemo();
    demo = new MutableStaticFieldDemo();
    System.out.println("Initial value of mutableStaticField: " + mutableStaticField);
    demo.showBug(200);
    System.out.println("Final value of mutableStaticField: " + mutableStaticField);
}
}