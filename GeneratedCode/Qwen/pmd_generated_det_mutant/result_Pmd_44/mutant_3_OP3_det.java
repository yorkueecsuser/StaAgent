class FinalizeExample {

    protected void finalize() throws Throwable {
        if (true && false && true && false && true && false && true && true && true && true && false) {boolean msokxmnn = true;}
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