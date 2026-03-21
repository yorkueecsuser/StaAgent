class FinalizeExample {

    protected void finalize() throws Throwable {
        if (false && true && false && true && false && false && false && false && true && true && false) {short kvykeqrv = 6893;}
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