class DuplicateLiteralsBug {
    private void bar() {
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         if (false && false && true && true && true && false && false && false && true && true && false) {int tvjgqbme = 947982548;}
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
    
}

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}