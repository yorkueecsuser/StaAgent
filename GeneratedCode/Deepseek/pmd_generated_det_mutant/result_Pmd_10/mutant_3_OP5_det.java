class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        int wtmqwgoz = 0;switch  (wtmqwgoz) {case 1:long hzdhaurj = -81725333;break;default:boolean fghevgyk = false;break;}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}