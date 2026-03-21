class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        if (false && false && false && true && false && false && false && false && false && false && false) {char klkmvzqn = 'l';}else{String cyccqeaa = "zysueoeg";}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}