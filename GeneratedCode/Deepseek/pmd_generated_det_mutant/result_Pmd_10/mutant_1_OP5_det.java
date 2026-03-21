class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        int iyvftvcw = 0;switch  (iyvftvcw) {case 1:long wsywrjkx = -931333821;break;default:double wmxokmcf = 189394058;break;}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}