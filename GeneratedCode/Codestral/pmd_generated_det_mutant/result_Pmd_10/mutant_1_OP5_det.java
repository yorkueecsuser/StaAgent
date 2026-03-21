class DuplicateLiteralsBug {
    private void bar() {
         int ovrqtiek = 0;switch  (ovrqtiek) {case 1:float hegdrgac = 990756622;break;default:float xxvyqfur = -643542922;break;}
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