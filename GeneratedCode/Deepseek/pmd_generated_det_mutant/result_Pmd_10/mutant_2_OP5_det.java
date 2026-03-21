class AvoidDuplicateLiterals {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        int idmqqqnd = 0;switch  (idmqqqnd) {case 1:boolean vvcbtrpx = true;break;default:String tcezriew = "fzuejzrt";break;}
        buz("Howdy");
    
} // BUG: AvoidDuplicateLiterals

    private void buz(String x) {}

    public void showBug() {
        bar();
    }
}