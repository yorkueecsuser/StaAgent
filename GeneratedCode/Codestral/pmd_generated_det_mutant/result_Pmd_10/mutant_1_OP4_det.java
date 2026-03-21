class DuplicateLiteralsBug {
    private void bar() {
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         if (true && true && true && false && true && false && false && false && false && true && false) {short oaqzbiuz = -9319;}else{boolean apnfybtf = true;}
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
         buz("Howdy"); // BUG: AvoidDuplicateLiterals
    
}

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}