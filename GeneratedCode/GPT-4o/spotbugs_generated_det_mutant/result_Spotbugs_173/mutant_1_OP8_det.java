class FinalizerAccessExample {

    // This finalize method should not be public according to the bug rule
    public void finalize() throws Throwable {  // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
        super.finalize();
    }

    public String showBug() {
        // Demonstrating the bug by triggering garbage collection
        FinalizerAccessExample example = new FinalizerAccessExample();
        example = null;
        System.gc(); // Suggesting garbage collection to invoke finalize()
        return "Finalize method might be called if the object is garbage collected.";
    }

    public static void main(String[] args) {
        FinalizerAccessExample example = new FinalizerAccessExample();
        String lymxgdga = example.showBug();
        System.out.println(lymxgdga);
    }
}