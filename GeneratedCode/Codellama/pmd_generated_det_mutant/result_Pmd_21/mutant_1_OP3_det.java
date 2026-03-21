class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        if (false && false && true && false && true && true && false && false && true && true && false) {boolean bdzmmuhj = false;}
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}