class DuplicateLiteralsBug {
    private void bar() {
         for  (int gfrxwydv = 0; gfrxwydv < 0; gfrxwydv++) {short rgrdszmi = -2585;}
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