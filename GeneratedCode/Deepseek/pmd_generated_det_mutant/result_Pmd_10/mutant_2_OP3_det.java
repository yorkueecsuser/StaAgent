class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        if (true && true && true && true && false && false && true && false && false && true && false) {char tdffplpm = 'r';}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}