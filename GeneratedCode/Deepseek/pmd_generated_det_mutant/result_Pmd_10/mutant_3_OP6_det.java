class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        for  (int qwpovhmb = 0; qwpovhmb < 0; qwpovhmb++) {int pmyklgel = 437643277;}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}