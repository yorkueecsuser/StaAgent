class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int hwdwenwo = 0;switch  (hwdwenwo) {case 1:short xzdjyjhi = 5701;break;default:int kmdmfcam = -310738618;break;}
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}