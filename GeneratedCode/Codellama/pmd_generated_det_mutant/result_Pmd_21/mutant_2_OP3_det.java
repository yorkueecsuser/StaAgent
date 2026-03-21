class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        if (true && true && false && true && true && true && false && false && true && false && false) {float prlpnnfq = 195316560;}
        System.out.println("Hello, world!");
    
}
}