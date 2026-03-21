class DuplicateLiteralsBug {
    private void bar() {
         boolean dmwjjnhy = false;while (dmwjjnhy && false && false && false && false && false && false && false && false && false && true && false) {int njevtfrk = 104502218;}
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
    
}

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}