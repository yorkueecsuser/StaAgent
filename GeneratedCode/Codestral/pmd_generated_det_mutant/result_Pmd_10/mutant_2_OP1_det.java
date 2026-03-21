class DuplicateLiteralsBug {
    private void bar() {
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         byte cchfpoxs = 82;
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
    
}

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}