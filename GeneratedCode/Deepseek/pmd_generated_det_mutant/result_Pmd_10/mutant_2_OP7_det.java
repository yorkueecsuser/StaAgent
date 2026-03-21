class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        boolean pjptubmt = false;while (pjptubmt && false && true && false && false && true && false && true && true && true && true && false) {double zhdxmpjz = -582306796;}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}