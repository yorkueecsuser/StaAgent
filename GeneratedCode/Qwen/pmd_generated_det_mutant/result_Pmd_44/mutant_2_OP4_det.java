class FinalizeExample {

    protected void finalize() throws Throwable {
        if (false && true && true && true && true && false && true && false && true && true && false) {String wstaopbg = "bxxlumky";}else{char grphrgli = 'd';}
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