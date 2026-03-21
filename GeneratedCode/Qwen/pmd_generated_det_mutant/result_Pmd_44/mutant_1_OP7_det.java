class FinalizeExample {

    protected void finalize() throws Throwable {
        boolean hwyirshg = false;while (hwyirshg && false && true && false && false && true && true && false && false && true && false && false) {int nmosxbrq = -664633452;}
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