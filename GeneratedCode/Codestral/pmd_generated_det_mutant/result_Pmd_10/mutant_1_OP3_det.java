class DuplicateLiteralsBug {
    private void bar() {
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         if (false && false && false && false && false && false && false && true && true && true && false) {int vlvpvthv = -893985788;}
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
    
}

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}