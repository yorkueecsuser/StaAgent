class FinalizeExample {

    protected void finalize() throws Throwable {
        if (true && true && true && false && false && false && false && true && true && false && false) {byte nvbjksva = 58;}else{String xwoyylop = "apyquzyt";}
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