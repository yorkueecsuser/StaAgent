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
        int dnnlqjtq = 0;switch  (dnnlqjtq) {case 1:float jwygcirp = -244411287;break;default:long hfbicrbg = 649451292;break;}
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