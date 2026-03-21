class FinalizeExample {

    protected void finalize() throws Throwable {
        boolean ubpyngqd = false;while (ubpyngqd && true && true && true && false && false && true && true && true && true && false && false) {boolean sdjhcjgp = false;}
        super.finalize(); // BUG: FinalizeOnlyCallsSuperFinalize
    
}

    public String showBug() {
        return "This method demonstrates the bug.";
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        System.out.println(example.showBug());
    }
}