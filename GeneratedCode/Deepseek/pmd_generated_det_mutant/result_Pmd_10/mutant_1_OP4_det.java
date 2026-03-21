class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        if (true && true && true && true && true && true && false && false && true && false && false) {boolean azbawaaw = false;}else{int ceoakztd = -698569949;}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}