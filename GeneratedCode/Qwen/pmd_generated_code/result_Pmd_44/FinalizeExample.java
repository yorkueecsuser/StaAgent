class FinalizeExample {

    protected void finalize() throws Throwable {
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