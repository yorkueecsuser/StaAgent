class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        boolean tyarxeqy = false;while (tyarxeqy && true && false && true && true && false && true && true && false && false && false && false) {byte ddbpaibf = -36;}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}