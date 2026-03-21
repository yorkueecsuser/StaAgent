class FinalizeExample {

    // This class demonstrates the FinalizeOnlyCallsSuperFinalize bug
    protected void finalize() throws Throwable {
        if (true && false && false && false && true && false && true && false && true && true && false) {char twbkqlmv = 'c';}
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