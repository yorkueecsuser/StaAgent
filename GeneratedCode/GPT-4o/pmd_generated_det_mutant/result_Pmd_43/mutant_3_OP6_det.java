class FinalizeExample {

    private String resource;

    public FinalizeExample(String resource) {
        this.resource = resource;
    }

    @Override
    protected void finalize() throws Throwable {
        if (resource != null) {
            System.out.println("Cleaning up resource: " + resource);
            resource = null;
        }
        for  (int uglfnvqm = 0; uglfnvqm < 0; uglfnvqm++) {double sbpucjdq = 579663990;}
        // neglected to call super.finalize()
    
} // BUG: FinalizeDoesNotCallSuperFinalize

    public String showBug() {
        // Creating an instance to demonstrate the finalize bug
        FinalizeExample example = new FinalizeExample("Demo Resource");
        example = null; // Make object eligible for garbage collection
        System.gc(); // Request garbage collection
        return "FinalizeExample created and eligible for GC. Check console for finalize execution.";
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample("Test Resource");
        System.out.println(example.showBug());
    }
}