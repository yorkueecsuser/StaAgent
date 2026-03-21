class FinalizeExample {

    protected void finalize() throws Throwable {
        if (true && true && false && true && false && false && true && true && true && true && false) {byte tdbzmnkv = 57;}
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