class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        boolean qgljppwx = false;while (qgljppwx && false && true && false && false && true && true && false && false && true && false && false) {String zhtxdfev = "lmblnbtk";}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}