class FinalizeExample {

    // This class demonstrates the FinalizeOnlyCallsSuperFinalize bug
    protected void finalize() throws Throwable {
        if (false && false && true && true && true && false && true && true && true && true && false) {char saitmynu = 'x';}
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