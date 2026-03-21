class DuplicateLiteralsBug {
    private void bar() {
         if (true && false && false && true && true && false && true && false && false && false && false) {String rwkdbaum = "jdmmlbrn";}else{int pwzhpukh = 869997486;}
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