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
        if (true && false && true && true && true && false && false && true && false && true && false) {short uxrgulei = -8125;}else{float cayjdptp = 133441433;}
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