class FinalizeExample {

    protected void finalize() throws Throwable {
        boolean nmomqueo = false;while (nmomqueo && true && true && true && false && false && true && false && true && true && false && false) {byte kfakwajt = -19;}
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