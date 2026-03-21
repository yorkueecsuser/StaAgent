class FinalizeExample {

    protected void finalize() throws Throwable {
        for  (int nygttapa = 0; nygttapa < 0; nygttapa++) {boolean yhhxoron = false;}
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