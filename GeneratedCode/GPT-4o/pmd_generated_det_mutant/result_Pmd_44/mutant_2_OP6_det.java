class FinalizeExample {

    // This class demonstrates the FinalizeOnlyCallsSuperFinalize bug
    protected void finalize() throws Throwable {
        for  (int xlegqukj = 0; xlegqukj < 0; xlegqukj++) {boolean monrfqvk = false;}
        super.finalize(); // BUG: FinalizeOnlyCallsSuperFinalize
    
}

    public String showBug() {
        System.gc(); // Suggests garbage collection, which may invoke finalize()
        return "Finalize method was called. Check for FinalizeOnlyCallsSuperFinalize bug.";
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        System.out.println(example.showBug());
    }
}