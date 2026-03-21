class DuplicateLiteralsBug {
    private void bar() {
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         String fighjobh = "gxwtwsla";
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
    
}

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}