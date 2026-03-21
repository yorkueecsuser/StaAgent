class FinalizeExample {

    protected void finalize() throws Throwable {
        if (true && true && true && true && true && true && false && false && false && true && false) {double rzfhsxqw = -57454322;}else{boolean dwtotmxo = true;}
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