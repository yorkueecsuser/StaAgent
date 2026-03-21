class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        if (false && false && true && true && true && false && true && true && false && true && false) {short tpgplppj = -9654;}
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}