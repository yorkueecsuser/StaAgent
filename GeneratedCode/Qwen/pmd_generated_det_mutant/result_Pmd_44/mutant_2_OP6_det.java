class FinalizeExample {

    protected void finalize() throws Throwable {
        for  (int dzsvniqi = 0; dzsvniqi < 0; dzsvniqi++) {long rryxetbw = 557124083;}
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