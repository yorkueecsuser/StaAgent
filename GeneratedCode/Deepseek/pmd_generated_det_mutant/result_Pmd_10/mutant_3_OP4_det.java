class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        if (false && false && false && true && false && false && true && true && true && true && false) {char ncwsfxuw = 'r';}else{float kcronkwh = -289249447;}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}